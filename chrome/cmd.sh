#!/bin/bash
ip route delete default dev eth0
dhclient eth1
ip route add 10.190.0.0/16 via 172.20.20.1
