#!/usr/bin/bash
docker run -d -p 100.0.0.1:53:53/udp -p 100.0.0.1:53:53/tcp -v $(pwd)/Corefile:/Corefile coredns/coredns:latest -conf /Corefile
