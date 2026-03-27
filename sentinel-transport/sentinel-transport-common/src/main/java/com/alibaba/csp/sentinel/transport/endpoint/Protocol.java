package com.alibaba.csp.sentinel.transport.endpoint;

/**
 */
public enum Protocol {
    HTTP,
    HTTPS;

    public String getProtocol() {
        return name().toLowerCase();
    }
}
