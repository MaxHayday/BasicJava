package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.SUCCESS;

public class SuccessHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode() {
            return SUCCESS;
    }
}
