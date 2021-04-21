package com.maxhayday.hw.hw06;

import org.springframework.stereotype.Component;

@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        //20 lines of code
        return "<HTML> Welcome new client</HTML>";
    }
}
