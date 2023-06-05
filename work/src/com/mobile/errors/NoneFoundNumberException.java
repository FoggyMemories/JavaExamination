package com.mobile.errors;

//未找到此数字错误

public class NoneFoundNumberException extends RuntimeException {

    public NoneFoundNumberException() {
    }

    public NoneFoundNumberException(String message) {
        super(message);
    }

}
