package com.maxhayday.hw.hw06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service
public class DistributionService {

    @Autowired
    private Map<String, MailGenerator> map;
    @Autowired
    DBUtils dbUtils;

    @Scheduled(fixedDelay = 300)
    public void sendMail() {
        int mailCode = dbUtils.getMailCode();
        MailGenerator mailGenerator = map.get(String.valueOf(mailCode));
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateMail();
        send(html);
    }

    private void send(String html) {
        System.out.println("html was sent: " + html);
    }
}
