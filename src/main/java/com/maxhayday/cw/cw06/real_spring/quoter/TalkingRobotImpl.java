package com.maxhayday.cw.cw06.real_spring.quoter;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
public class TalkingRobotImpl implements TalkingRobot {
    private List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(quoter -> quoter.sayQuote());
    }

}
