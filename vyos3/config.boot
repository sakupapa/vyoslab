interfaces {
    ethernet eth0 {
        description "Management Interface"
        offload {
            gso
            sg
            tso
        }
    }
    ethernet eth2 {
        address 192.168.2.254/24
        vrf ent
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDfTCCAmWgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwUDELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxFDASBgNVBAMTC3Z5b3MgbGFiIENBMB4XDTI2MDIxOTEyMzEwNloXDTI3MDIxOTEyMzEwNlowUDELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxFDASBgNVBAMTC3Z5b3MgbGFiIENBMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA357oQzcZeoqpw+Cu1poJpmNgF5HjCoFO933M6atjc0phm/4GldQ/n91OFGjE16w7QbAl96/3vo9glvmXWZj/r/OUJ7hWbbw1nMCC1Oh2Lx6ZSGzwheMr5ZdVKbdsfDfrJb+kS7/Hc6CHBKprtBrDYJYqOlQUnnvNVAW+dy4Drt9Nx+DBvOXWpuec9haogqjHJWc9f524EAr8ZTDPsv8k2QL7sg9FgxVPAKMWONH0QSpiQ1u35dQkpcaR6Y3nVxDwFlCXldYgy8cZOswjmvvYS1Pmhaul93akpmYHzYFH4ziHWxnNfWebzaUeW1bTVruvxf89zHZCEE4EyOAPpOlH1wIDAQABo2EwXzAOBgNVHQ8BAf8EBAMCAoQwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMBMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFIHI2VufRTDuwMjqhywKUHrmhEu0MA0GCSqGSIb3DQEBCwUAA4IBAQAGPnt4oVgviGWqETvHGneub32CLm/85ZsiQA2zrCaTZ4lYmgMqg7RuQZsNlfyhJ9CQtKkrzMzU60LW0XGaFuivsKMOw7z/nA9g+DH9/xNGxzwp/KoGiFCq5RA16AfvWehrUOjGhvJ+Jtprr12uaY4kFt1eKWpeWeFF1kGo3NJ/hpi4O/S3Hq/+mvDhtA/1Q46Sp75S0TFySKu1W/0hN0PCYX5H0wOvADazNsLnYvBfGdk5uYgfafLfEUuhU7O53nligEWGKzpPW2xzjO8qNo2aw7zY/1njHiDXFb/WJQag/g7uL7XCVtN4y9XExSm3GM2fhMvSWisefNQcA6vq3iEp"
    }
    certificate self {
        certificate "MIIDtDCCApygAwIBAgICBnowDQYJKoZIhvcNAQELBQAwUDELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxFDASBgNVBAMTC3Z5b3MgbGFiIENBMB4XDTI2MDIxOTEyMzEwNloXDTI3MDIxOTEyMzEwNlowUjELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxFjAUBgNVBAMTDXZ5b3MxLnZ5b3MuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDYPWXOoULENzQ5NBgjPW+gY0PHwiguiljv0vjjvWTSvinzblyLJLj0Bb1CAIfeJ+Z9aA3YZahVBSPXDAoMsD/m8WZUccwY1CKqhBGB4BCYBisRfU6HjQZ47p08zw3IK4QZNMWpptAQG7xzsynOUCA0G+T15p0evBe6QM5KVd7mcSfRokF/ZohC8RbBg59phSFNhyp4LDooMO3jy/Oy0TtiG8YDYSzK1GFjP85TDLaT/c/JKvpTNL1CLBArlnQb0u3mdGEoeY2GRPFuSu2F0ImHyE8QW7kGhh1fOYLwTfJlvGmXez927WuZXB5h3PyJT+ifApbtrT49kSGAQiqc3L0JAgMBAAGjgZUwgZIwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUgcjZW59FMO7AyOqHLApQeuaES7QwMAYDVR0RBCkwJ4IFdnlvczGCD2NsYWItdnlvcy12eW9zMYINdnlvczEudnlvcy5pbzANBgkqhkiG9w0BAQsFAAOCAQEAJhvwuJnlFFsKTu0JpGK+nM07fh3orksLsWJ5Mvj+uyTCk/67CR9OW9CkyDcP5FJwMlyX8X1NQQgMPhw4nx8gd1mcT49R8eHo548Rg51earj8yKEPWai7c9jcvb/k9PyP63SSlnFQ5fK9bvIGNjLnhWvfbZz6dQn2rCG4XxUY+/Vp7fgSLf9TH3+xJB4NR1v22Tbybb8xmfBnhjjOlL4lJYJtASn8x3JvE7v13oKbhxh3C/iGoEzQSAIzXIP6fKsKaUn9247UiYYBQl/wfHOvq/gJFLCWt3vUfSRt6dhLahksZWzobEhFoam7NGnj3XwOAqRJdEpl219mVS1X/m9K7w=="
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDYPWXOoULENzQ5NBgjPW+gY0PHwiguiljv0vjjvWTSvinzblyLJLj0Bb1CAIfeJ+Z9aA3YZahVBSPXDAoMsD/m8WZUccwY1CKqhBGB4BCYBisRfU6HjQZ47p08zw3IK4QZNMWpptAQG7xzsynOUCA0G+T15p0evBe6QM5KVd7mcSfRokF/ZohC8RbBg59phSFNhyp4LDooMO3jy/Oy0TtiG8YDYSzK1GFjP85TDLaT/c/JKvpTNL1CLBArlnQb0u3mdGEoeY2GRPFuSu2F0ImHyE8QW7kGhh1fOYLwTfJlvGmXez927WuZXB5h3PyJT+ifApbtrT49kSGAQiqc3L0JAgMBAAECggEABE4EmX51rnj4My3++lnzakVPnh8WtFvQtXAvwD45pEW2NBW9sI9vQdGzbihF4X2jMFqX8UzkyFHX4CS/NngebYyKCvhQ+yrjSHMPSNSbFUuveSOozTiuKPjRwdolXhdvrnNx0+ocOOs0bzaL3dg+gTW6SHg/fH3QwxvIf4usv6L2UUX/VgQ6WthBYCOVd9ww1H8wh9j0zLGAom8ap53z7JXVYdFVbCWLS/OH+JZAcaX/9Se/3dfh9Xtw7RwJAa0wNR/RHsGouOUNBof/7rnxBMsBwz6pFLdB5FYkYrALGNXCb/isBv+zg1BN4b8O7DuJwXw3dVXv65M2dobnL20LOQKBgQDaiSj0dZ0/kV2UmUwLnsNs+H8yUuxkh0HSZnCPl5rSDcUmHmn03Lx8sG4s5TjEh34Lbz+IxNxNBAIpN0KEtIUDlkqRS1yRons+xOkKZUdPBVngtHtZTZ7iY2xA/mwwjrX0m7r2mI08hsR4r9HFf6l5KHItnepWZaYHJrxTLO1ViwKBgQD9T3nV3YbCI4ZiStMwvsnw5OvGGjshC54ismMoLvoQ7OnLhfx4IVAfAlI8BrQ3qSAW7cuWIfN9ct42YV4dowwjrbCAN50FVJe+QVDr4T9embYB3bCxu7b430cp+WKE1vzra+a+ZyDFLVBhqb+8WAwUN4SVe7O/ICqKHVe4obrSOwKBgEfLxhvCRD4tKNx4HKa4qyWy4j8LRUSltzdDlnlmamPWSE4EsfTTTE1+vUOcrzDJ/twM2Ye6fVIEHh2iXQUyNXz/NFJVuvzRr8HoeVOEAJByhpuvT9MAEFH6LgeQTsUJLbhGLX90kPowoH2x7a4AChKW+iQIfIOT857n1/lPik2PAoGAeddXkBIc9pal1fONv72VXsSNz9zgIhX3e1L4tORbrfZ2wklxVcsYQcIZEfxbhQZZhA3fRhiQiP/OeLO+1FyPwz2RTyrw4RZ+YqoCJWNT2snurNkYW3UiHnUvQrZMt/686vQcqerq7UzNhBxlOE/Vh4fowwocPEtZitNwVUOdm+8CgYEAjLoBwjbiVPVplAFRZASzduyBGEzlADMI7eVr5kW8WUPJ7WknksU97KtYO/uaGxvUiLlkxDM1iXNjMMSf4lzJydamEDwRU20fuuQ/3eNWn1wHd+4vgNU1jV4xK3l/oVwAoVp0+rye46E6vfFug8SMSn9zK1VcXYQ9jQxH3fgJyhw="
        }
    }
}
protocols {
    mpls {
        interface eth1
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    console {
        device ttyS0 {
            speed "115200"
        }
    }
    host-name "vyos3"
    login {
        tacacs {
            server 10.3.0.1 {
                key "cisco123"
                port "49"
            }
        }
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$X9PW0U3/7SaNaviB$REBqhlRB/hH962.bO2PiQuNf1kBwN2rWDlMKpbY8/lV1wCLkFfkXsXWNbETzF5wcQa1EKsZxuqGkgWQAZFXAT/"
                public-keys clab {
                    key "AAAAC3NzaC1lZDI1NTE5AAAAIGnQVQehJ63V0adQsB9NUjHagUUeOX87VHE3n5BMpiMW"
                    type "ssh-ed25519"
                }
            }
        }
        user vyos {
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}
vrf {
    name ent {
        table 100
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@20:flow-accounting@3:https@7:ids@2:interfaces@34:ipoe-server@4:ipsec@14:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:nhrp@1:ntp@3:openconnect@3:openvpn@5:ospf@2:pim@1:policy@8:pppoe-server@12:pptp@5:qos@2:quagga@12:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@3:sstp@6:system@31:vpp@5:vrf@4:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 2026.02
