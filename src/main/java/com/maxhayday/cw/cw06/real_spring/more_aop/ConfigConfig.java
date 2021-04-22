package com.maxhayday.cw.cw06.real_spring.more_aop;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import com.maxhayday.cw.cw06.real_spring.more_aop.business.DBException;
import com.maxhayday.cw.cw06.real_spring.more_aop.business.SomeService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@ImportResource("classpath:aop.xml")
@PropertySource("classpath:mail.properties")
@EnableAspectJAutoProxy
public class ConfigConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigConfig.class);
        SomeService someService = context.getBean(SomeService.class);


        try {
            someService.work();
        } catch (DBException e) {
            System.out.println("there was a problem, but we are solving");
        }
    }
}

