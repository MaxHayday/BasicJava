package com.maxhayday.cw.cw06.real_spring.quoter;

import lombok.Data;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.Arrays.asList;

@Data
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Book
    private List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(quoter -> quoter.sayQuote());
    }

}
