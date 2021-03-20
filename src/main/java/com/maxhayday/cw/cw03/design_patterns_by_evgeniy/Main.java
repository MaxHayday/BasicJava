package com.maxhayday.cw.cw03.design_patterns_by_evgeniy;

import com.maxhayday.cw.cw03.design_patterns.DistributionService;
import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        com.maxhayday.cw.cw03.design_patterns.DistributionService service = new DistributionService();
        while (true){
            Thread.sleep(500);
            service.sandMail();
        }
    }
}
