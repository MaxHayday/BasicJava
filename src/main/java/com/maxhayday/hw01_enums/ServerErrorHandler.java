package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.SERVER_ERROR;

public class ServerErrorHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode() {
            return SERVER_ERROR;
    }
}
