package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.CLIENT_ERROR;

public class ClientErrorHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode(int httpCode) {
        if (httpCode >= 400 && httpCode <= 499)
            return CLIENT_ERROR;
        else return null;
    }
}
