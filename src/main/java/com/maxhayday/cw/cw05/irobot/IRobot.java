package com.maxhayday.cw.cw05.irobot;


import lombok.SneakyThrows;


public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void init() {
       // System.out.println(speaker.getClass().getName());
    }

    @SneakyThrows
    public void cleanRoom() {
        speaker.speak("I started...");
        cleaner.clean();
        speaker.speak("I finished...");
    }

}
