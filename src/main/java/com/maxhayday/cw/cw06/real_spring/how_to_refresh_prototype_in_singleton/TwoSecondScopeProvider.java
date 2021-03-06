package com.maxhayday.cw.cw06.real_spring.how_to_refresh_prototype_in_singleton;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.SneakyThrows;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TwoSecondScopeProvider implements Scope {

    private Cache<String, Object> cache = CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.SECONDS).build();


    @Override
    @SneakyThrows
    public Object get(String name, ObjectFactory<?> objectFactory) {
        return cache.get(name, objectFactory::getObject);
    }


    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
