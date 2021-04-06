package com.maxhayday.cw.cw05.irobot;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        //      ObjectFactory.getInstance().createObject(IRobot.class).cleanRoom();
//        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
//        iRobot.cleanRoom();
        WorkerImpl worker = ObjectFactory.getInstance().createObject(WorkerImpl.class);
        while (true) {
            worker.work();
            worker.drinkBeer();
            Thread.sleep(1000);
        }
    }
}
