provider "google" {
  project = var.project_id
  region  = var.region
  zone    = var.zone
}

resource "google_compute_instance" "clab" {
  name         = var.instance_name
  machine_type = var.machine_type
  zone         = var.zone
  tags         = ["clab"]

  boot_disk {
    initialize_params {
      image = "debian-cloud/debian-12"
      size  = var.disk_size
      type  = "pd-balanced"
    }
  }

  network_interface {
    network = "default"
    access_config {} # External IP
  }

  metadata = {
    ssh-keys = "${var.ssh_user}:${file(var.ssh_pub_key_path)}"
  }

  metadata_startup_script = <<-EOT
    #!/bin/bash
    set -e

    apt-get update
    apt-get install -y ca-certificates curl gnupg lsb-release sudo

    # ユーザー作成
    if ! id "${var.ssh_user}" >/dev/null 2>&1; then
      useradd -m -s /bin/bash ${var.ssh_user}
      usermod -aG sudo ${var.ssh_user}
    fi

    # Docker公式リポジトリ追加
    install -m 0755 -d /etc/apt/keyrings
    curl -fsSL https://download.docker.com/linux/debian/gpg \
      | gpg --dearmor -o /etc/apt/keyrings/docker.gpg
    chmod a+r /etc/apt/keyrings/docker.gpg

    echo \
      "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] \
      https://download.docker.com/linux/debian \
      $(. /etc/os-release && echo $VERSION_CODENAME) stable" \
      > /etc/apt/sources.list.d/docker.list

    apt-get update
    apt-get install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin bridge-utils

    usermod -aG docker ${var.ssh_user}

    # containerlab install
    bash -c "$(curl -sL https://get.containerlab.dev)"

    systemctl enable docker
    systemctl start docker
  EOT
}
