package com.maxhayday.cw.cw06.exercise;


import org.springframework.stereotype.Repository;

@Repository
public class DerbyDao implements Dao {
    @Override
    public void crud() {
        System.out.println("Derby DB");
    }
}
