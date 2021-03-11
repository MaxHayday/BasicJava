package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.REDIRECTION;

public class RedirectionHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode() {
            return REDIRECTION;
    }
}
