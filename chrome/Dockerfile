FROM debian:bookworm-slim

ENV DEBIAN_FRONTEND=noninteractive
ENV DISPLAY=:0
ENV VNC_PORT=5900
ENV NOVNC_PORT=6080

# 基本パッケージ + iproute2 + GUI + VNC関連
RUN apt-get update && apt-get install -y \
    ca-certificates curl gnupg wget \
    iproute2 iputils-ping net-tools \
    xvfb x11vnc openbox \
    fluxbox \
    novnc websockify \
    supervisor \
    fonts-liberation \
    libasound2 libatk-bridge2.0-0 libatk1.0-0 \
    libc6 libcairo2 libcups2 libdbus-1-3 \
    libexpat1 libfontconfig1 libgcc-s1 \
    libglib2.0-0 libgtk-3-0 libnspr4 \
    libnss3 libpango-1.0-0 libx11-6 \
    libx11-xcb1 libxcb1 libxcomposite1 \
    libxcursor1 libxdamage1 libxext6 \
    libxfixes3 libxi6 libxrandr2 \
    libxrender1 libxss1 libxtst6 \
    xdg-utils \
    isc-dhcp-client \
    --no-install-recommends && \
    rm -rf /var/lib/apt/lists/*

# Chrome repository
RUN mkdir -p /etc/apt/keyrings && \
    curl -fsSL https://dl.google.com/linux/linux_signing_key.pub | gpg --dearmor -o /etc/apt/keyrings/google.gpg && \
    echo "deb [arch=amd64 signed-by=/etc/apt/keyrings/google.gpg] http://dl.google.com/linux/chrome/deb/ stable main" \
    > /etc/apt/sources.list.d/google-chrome.list

RUN apt-get update && apt-get install -y google-chrome-stable && \
    rm -rf /var/lib/apt/lists/*

# 非rootユーザー
RUN useradd -m chromeuser
USER chromeuser
WORKDIR /home/chromeuser

# Supervisor設定
USER root
RUN mkdir -p /var/log/supervisor

COPY supervisord.conf /etc/supervisor/conf.d/supervisord.conf

EXPOSE 5900 6080

CMD ["/usr/bin/supervisord", "-n"]
