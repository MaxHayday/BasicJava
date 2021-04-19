package com.maxhayday.cw.cw06.real_spring.qualifiers_examples;


import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

@DeutscheBankRepo(DBType.ORACLE)
public class OracleDao implements Dao {
    @Override
    @SneakyThrows
    public void saveAll() {
        Thread.sleep(5);
        System.out.println("saved to Oracle DB");
    }
}
