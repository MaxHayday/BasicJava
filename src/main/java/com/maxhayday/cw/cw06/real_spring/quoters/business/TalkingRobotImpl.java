package com.maxhayday.cw.cw06.real_spring.quoters.business;

import com.maxhayday.cw.cw06.real_spring.quoters.Book;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private List<Quoter> quoters;

    @Override
    @EventListener(ContextRefreshedEvent.class)
    @Secured
    public void talk() {
        quoters.forEach(quoter -> quoter.sayQuote());
    }

}
