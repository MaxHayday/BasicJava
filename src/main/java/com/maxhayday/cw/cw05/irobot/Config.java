package com.maxhayday.cw.cw05.irobot;

public interface Config {

    <T> Class<T> getImplClass(Class<T> type);
}
