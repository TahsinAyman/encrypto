package com.fullstackbd.tahsin.backend.exceptions;

public class StatusCodeOutOfRange extends Exception {
    public StatusCodeOutOfRange() {
    }

    public StatusCodeOutOfRange(String message) {
        super(message);
    }

    public StatusCodeOutOfRange(String message, Throwable cause) {
        super(message, cause);
    }

    public StatusCodeOutOfRange(Throwable cause) {
        super(cause);
    }

    public StatusCodeOutOfRange(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
