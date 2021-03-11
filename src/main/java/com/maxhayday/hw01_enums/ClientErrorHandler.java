package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.CLIENT_ERROR;

public class ClientErrorHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode() {
            return CLIENT_ERROR;
    }
}
