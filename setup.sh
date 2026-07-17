#!/usr/bin/bash

sudo brctl addbr br-dc
sudo ip link set dev br-dc up
sudo ip addr add 100.0.0.1/24 dev br-dc
sudo ip route add 100.1.0.0/24 via 100.0.0.254
docker build -t br:1.0 ./br
docker build -t nginx:1.0 ./nginx
docker build -t tacacs:1.0 ./tacacs
docker build -t chrome:1.0 ./chrome
docker pull coredns/coredns
 
