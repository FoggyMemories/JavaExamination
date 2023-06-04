package com.mobile.errors;

public class NameOutOfBoundsException extends RuntimeException{

    public NameOutOfBoundsException() {
    }

    public NameOutOfBoundsException(String message) {
        super(message);
    }
}
