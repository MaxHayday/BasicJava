package com.maxhayday.hw.hw06;

import org.springframework.stereotype.Component;

@Component("2")
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        //20 lines of code
        return "<HTML> Don`t call us Nikolas</HTML>";
    }
}
