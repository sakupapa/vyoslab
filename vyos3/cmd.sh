#!/bin/bash

cp /opt/custom-frr/frr.conf /etc/frr/frr.conf
systemctl restart frr
ip link set mtu 1500 dev eth1
ip link set mtu 1500 dev eth2

