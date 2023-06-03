package com.mobile.errors;

public class NoneFoundNumberException extends RuntimeException {
    public NoneFoundNumberException() {
    }

    public NoneFoundNumberException(String message) {
        System.err.println(message);
        System.out.println("------------------------------------------------------------------------");
    }
}
