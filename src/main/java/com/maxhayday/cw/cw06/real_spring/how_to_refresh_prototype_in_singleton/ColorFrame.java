package com.maxhayday.cw.cw06.real_spring.how_to_refresh_prototype_in_singleton;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    @PostConstruct
    public void init() {
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        setSize(250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @SneakyThrows
    public void moveToRandomLocation() {
        setLocation(RandomUtils.getRandomNumberUsingInts(0, 1200), RandomUtils.getRandomNumberUsingInts(0, 900));
        getContentPane().setBackground(color);
        repaint();
    }


}
