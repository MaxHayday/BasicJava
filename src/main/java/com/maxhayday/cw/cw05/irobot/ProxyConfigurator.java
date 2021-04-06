package com.maxhayday.cw.cw05.irobot;

public interface ProxyConfigurator {
    <T> Object wrapWithProxy(Object object, Class<T> type);
}
