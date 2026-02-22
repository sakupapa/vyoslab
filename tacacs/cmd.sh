#!/bin/bash

ip addr add 10.3.0.1/24 dev eth1
ip route add 10.0.0.0/8 via 10.3.0.2
tac_plus -C /etc/tac_plus.conf
