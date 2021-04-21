package com.maxhayday.hw.hw06;

import org.springframework.stereotype.Component;

@Component("3")
public class GoodByeMailGeneratorImpl implements MailGenerator {
    @Override
    public String generateMail() {
        return "<html> don`t forget to do your homework!</html>";
    }
}
