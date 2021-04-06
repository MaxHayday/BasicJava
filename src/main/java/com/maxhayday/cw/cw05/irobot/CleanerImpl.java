package com.maxhayday.cw.cw05.irobot;

@Benchmark
public class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    public CleanerImpl() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        }
    }
}
