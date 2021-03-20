package com.maxhayday.cw.cw03.design_patterns_by_evgeniy;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        DistributionService service = new DistributionService();
        while (true) {
            try {
                service.sendMail();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Thread.sleep(500);
        }
    }
}
