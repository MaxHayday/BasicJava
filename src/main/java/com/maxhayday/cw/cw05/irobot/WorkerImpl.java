package com.maxhayday.cw.cw05.irobot;


public class WorkerImpl {

    public void work() {
        System.out.println("Working");
    }


    @Benchmark
    public void drinkBeer() {
        System.out.println("Drinking beer");
    }
}
