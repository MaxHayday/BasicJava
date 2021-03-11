package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.SERVER_ERROR;

public class ServerErrorHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode(int code) {
        if (code >= 500 && code <= 599)
            return SERVER_ERROR;
        else return null;
    }
}
