package com.maxhayday.hw01_enums;


import static com.maxhayday.hw01_enums.HttpCodesEnum.INFORMATIONAL;

public class InformationHandler implements Handler {

    @Override
    public HttpCodesEnum getHttpCode(int code) {
        if (code >= 100 && code <= 199)
            return INFORMATIONAL;
        else
            return null;
    }
}
