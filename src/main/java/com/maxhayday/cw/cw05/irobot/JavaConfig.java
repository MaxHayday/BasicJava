package com.maxhayday.cw.cw05.irobot;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig implements Config {
    private Map<Class, Class> inf2ImplClass = new HashMap<>();

    public JavaConfig() {
        inf2ImplClass.put(Speaker.class, ConsoleSpeaker.class);
        inf2ImplClass.put(Cleaner.class, CleanerImpl.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return inf2ImplClass.get(type);
    }
}
