package com.mobile.data;

public class CustomerInfo {
    private String cardNumber;
    private String type;
    private int consumerDate;


    public CustomerInfo() {
    }

    public CustomerInfo(String cardNumber, String type, int consumerDate) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.consumerDate = consumerDate;
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
     * @return consumerDate
     */
    public int getConsumerDate() {
        return consumerDate;
    }

    /**
     * 设置
     * @param consumerDate
     */
    public void setConsumerDate(int consumerDate) {
        this.consumerDate = consumerDate;
    }

    public String toString() {
        return "CustomerInfo{cardNumber = " + cardNumber + ", type = " + type + ", consumerDate = " + consumerDate + "}";
    }
}
