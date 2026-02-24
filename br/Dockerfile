FROM debian:stable-slim

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        dnsmasq \
        iptables \
        iproute2 \
        procps \
        ca-certificates && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# dnsmasq設定用ディレクトリ
RUN mkdir -p /etc/dnsmasq.d

# フォアグラウンドで起動
CMD ["dnsmasq", "-k"]
