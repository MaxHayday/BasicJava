package com.maxhayday.hw01_enums;


import static com.maxhayday.hw01_enums.HttpCodesEnum.INFORMATIONAL;

public class InformationHandler implements Handler {

    @Override
    public HttpCodesEnum getHttpCode() {
            return INFORMATIONAL;
    }
}
