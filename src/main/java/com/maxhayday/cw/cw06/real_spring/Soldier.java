package com.maxhayday.cw.cw06.real_spring;

import com.maxhayday.cw.cw06.real_spring.quoter.Conf;
import com.maxhayday.cw.cw06.real_spring.quoter.Quoter;
import com.maxhayday.cw.cw06.real_spring.quoter.TalkingRobotImpl;
import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

@Data
public class Soldier {
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
