package com.mobile.errors;

public class NoneFoundNumberException extends RuntimeException {

    public NoneFoundNumberException() {
    }

    public NoneFoundNumberException(String message) {
        super(message);
    }

}
