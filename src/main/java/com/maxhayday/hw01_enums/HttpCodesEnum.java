package com.maxhayday.hw01_enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum HttpCodesEnum {
    INFORMATIONAL(100, 199, new InformationHandler()),
    SUCCESS(200, 299, new SuccessHandler()),
    REDIRECTION(300, 399, new RedirectionHandler()),
    CLIENT_ERROR(400, 499, new ClientErrorHandler()),
    SERVER_ERROR(500, 599, new ServerErrorHandler());

    private final int min;
    private final int max;
    private final Handler handler;

    public static HttpCodesEnum findByHttpCode(int httpCode) {
        HttpCodesEnum[] enumValues = values();
        for (HttpCodesEnum value : enumValues) {
            HttpCodesEnum handler1 = value.getHandler().getHttpCode(httpCode);
            if (handler1 != null) {
                System.out.println(handler1);
                return handler1;
            }
        }
        throw new IllegalStateException(httpCode + " not supported yet");
    }
}
