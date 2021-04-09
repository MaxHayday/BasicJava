package com.maxhayday.cw.cw03.design_patterns_by_evgeniy.command_and_strategy;

@TemplateCode(3)
public class GoodByeMailGeneratorImpl implements MailGenerator {
    @Override
    public String generateMail() {
        return "<html> don`t forget to do your homework!</html>";
    }
}
