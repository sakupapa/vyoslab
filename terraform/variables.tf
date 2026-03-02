variable "project_id" {
  type = string
  default = "xrdlab"
}

variable "region" {
  type    = string
  default = "us-central1"
}

variable "zone" {
  type    = string
  default = "us-central1-c"
}

variable "instance_name" {
  type    = string
  default = "containerlab-host"
}

variable "machine_type" {
  type    = string
  default = "e2-medium"
}

variable "disk_size" {
  type    = number
  default = 20
}

variable "ssh_user" {
  type    = string
  default = "otakama"
}

variable "ssh_pub_key_path" {
  type = string
  default = "~/.ssh/id_rsa.pub"
}
