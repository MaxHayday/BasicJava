package com.maxhayday.cw.cw05.irobot;

import javax.swing.*;

public class PopupSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
