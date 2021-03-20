package com.maxhayday.cw.cw03.design_patterns_by_evgeniy;

@TemplateCode(1)
public class WelcomeMailGenerator implements MailGenerator{
    @Override
    public String generateMail() {
        //20 lines of code
        return "<HTML> Welcome new client</HTML>";
    }
}
