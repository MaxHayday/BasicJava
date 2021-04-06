package com.maxhayday.cw.cw05.irobot;

public class ConsoleSpeaker implements Speaker {

    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
