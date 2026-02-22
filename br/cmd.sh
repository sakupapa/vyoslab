#!/bin/bash
ip route del 0.0.0.0/0
ip addr add 192.168.1.254/24 dev eth1
ip addr add 100.1.0.1/24 dev eth2
ip route add default via 100.1.0.254
iptables -t nat -A POSTROUTING -s 192.168.1.0/24 -o eth2 -j SNAT --to-source 100.1.0.1
