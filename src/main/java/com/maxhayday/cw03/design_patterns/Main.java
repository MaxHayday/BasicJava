package com.maxhayday.cw03.design_patterns;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        DistributionService service = new DistributionService();
        while (true){
            Thread.sleep(500);
            service.sandMail();
        }
    }
}
