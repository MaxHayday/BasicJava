package com.maxhayday.hw01_enums;

import static com.maxhayday.hw01_enums.HttpCodesEnum.REDIRECTION;

public class RedirectionHandler implements Handler {
    @Override
    public HttpCodesEnum getHttpCode(int code) {
        if (code >= 300 && code <= 399)
            return REDIRECTION;
        else return null;
    }
}
