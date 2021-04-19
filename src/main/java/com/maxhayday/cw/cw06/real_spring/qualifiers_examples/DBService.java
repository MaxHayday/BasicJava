package com.maxhayday.cw.cw06.real_spring.qualifiers_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;


@org.springframework.stereotype.Service
public class DBService {

    @DeutscheBankRepo(DBType.MONGO)
    private Dao dao;

    @DeutscheBankRepo(DBType.ORACLE)
    private Dao backupDao;

    @Scheduled(fixedDelay = 500)
    public void work() {
        dao.saveAll();
    }
    @Scheduled(fixedDelay = 3000)
    public void backUp(){
        backupDao.saveAll();
    }
}
