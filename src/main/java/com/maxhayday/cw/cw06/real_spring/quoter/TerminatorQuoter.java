package com.maxhayday.cw.cw06.real_spring.quoter;

import com.maxhayday.cw.cw05.irobot.Benchmark;
import lombok.Data;

import javax.annotation.PreDestroy;
import java.util.List;

@Data
@Benchmark
@DeprecatedClass(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {
    private List<String> messages;

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll() {
        new Thread(() -> System.out.println("You are terminated")).start();
    }
}
