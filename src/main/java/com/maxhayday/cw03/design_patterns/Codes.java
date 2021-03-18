package com.maxhayday.cw03.design_patterns;

import com.maxhayday.hw01_enums.Handler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Codes {
    WELCOME_MAIL(1, new WelcomeCodeImp()), DONT_CALL_US(2, new DontCallUsImp());

    private final int code;
    private final CodesHandler handler;

    public static Codes getByCode(int code) {
        return Arrays.stream(values()).filter(codes -> codes.getCode() == code).findFirst().get();
    }

}
