#!/bin/bash

ip addr add 1.0.0.1/24 dev eth1
ip route add 100.0.0.0/8 via 1.0.0.254
