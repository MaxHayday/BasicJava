package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.SUCCESS;

public class SuccessHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode(int code) {
        if (code >= 199 && code <= 299)
            return SUCCESS;
        else return null;
    }
}
