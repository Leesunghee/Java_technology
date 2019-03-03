package com.himalaya.exception;

public class MyExcetion extends Exception {


    private static final long serialVersionUID = -7944064127187858654L;

    public MyExcetion() {
        super();
    }

    public MyExcetion(String message) {
        super(message);
    }

    public MyExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
