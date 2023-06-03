package com.mobile.data;

public class CustomerInfo {
    private String cardNumber;
    private String type;
    private int customerDate;


    public CustomerInfo() {
    }

    public CustomerInfo(String cardNumber, String type, int customerDate) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.customerDate = customerDate;
    }

    /**
     * 获取
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return customerDate
     */
    public int getCustomerDate() {
        return customerDate;
    }

    /**
     * 设置
     * @param customerDate
     */
    public void setCustomerDate(int customerDate) {
        this.customerDate = customerDate;
    }

    public String toString() {
        return "CustomerInfo{cardNumber = " + cardNumber + ", type = " + type + ", customerDate = " + customerDate + "}";
    }
}
