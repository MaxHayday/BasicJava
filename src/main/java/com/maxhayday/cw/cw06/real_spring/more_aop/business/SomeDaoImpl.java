package com.maxhayday.cw.cw06.real_spring.more_aop.business;

import org.springframework.stereotype.Repository;

@Repository
public class SomeDaoImpl implements SomeDao {
    @Override
    public void saveDate() {
        System.out.println("trying to save...");
        throw new DBException("fire all DBA");
    }
}
