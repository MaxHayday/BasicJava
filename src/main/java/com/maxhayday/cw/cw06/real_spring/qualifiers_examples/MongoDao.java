package com.maxhayday.cw.cw06.real_spring.qualifiers_examples;


@DeutscheBankRepo(DBType.MONGO)
public class MongoDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to Derby DB");
    }
}
