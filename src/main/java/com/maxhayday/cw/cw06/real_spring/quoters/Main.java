package com.maxhayday.cw.cw06.real_spring.quoters;

import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Data
public class Main {
    private int age;

    public void setAge(String age) {
        System.out.println(age);
    }

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        context.close();


//        Collection<Quoter> beansOfType = context.getBeansOfType(Quoter.class).values();
//        beansOfType.forEach(Quoter::sayQuote);


//        ShakeSpearQuoter shakeSpearQuoter = (ShakeSpearQuoter) context.getBean(ShakeSpearQuoter.class);
//        TerminatorQuoter terminatorQuoter = (TerminatorQuoter) context.getBean(TerminatorQuoter.class);
//        shakeSpearQuoter.sayQuote();
//        terminatorQuoter.sayQuote();
    }
}
