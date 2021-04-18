package com.maxhayday.cw.cw06.real_spring.quoter;

import com.maxhayday.cw.cw05.irobot.Benchmark;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;

import static java.util.Arrays.asList;


@Benchmark
@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages, @Value("${JAVA_HOME}") String javaHome) {
        System.out.println("javaHome = " + javaHome);
        this.messages = asList(messages);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll() {
        new Thread(() -> System.out.println("You are terminated")).start();
    }
}
