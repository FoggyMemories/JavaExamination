package com.mobile.errors;

//名字超过限制错误

public class NameOutOfBoundsException extends RuntimeException{

    public NameOutOfBoundsException() {
    }

    public NameOutOfBoundsException(String message) {
        super(message);
    }
}
