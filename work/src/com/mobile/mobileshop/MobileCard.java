package com.mobile.mobileshop;

public class MobileCard {
    private String userName;
    private String passWord;
    private String cardNumber;
    private ServicePackage serPackage;
    private double customerAmount;
    private int realTalkTime;
    private int realSMSCount;
    private int realFlow;


    public MobileCard() {
    }

    public MobileCard(String userName, String passWord, String cardNumber, ServicePackage serPackage, double customerAmount, int realTalkTime, int realSMSCount, int realFlow) {
        this.userName = userName;
        this.passWord = passWord;
        this.cardNumber = cardNumber;
        this.serPackage = serPackage;
        this.customerAmount = customerAmount;
        this.realTalkTime = realTalkTime;
        this.realSMSCount = realSMSCount;
        this.realFlow = realFlow;
    }

    /**
     * 获取
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     *
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     *
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     *
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置
     *
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * 获取
     *
     * @return serPackage
     */
    public ServicePackage getSerPackage() {
        return serPackage;
    }

    /**
     * 设置
     *
     * @param serPackage
     */
    public void setSerPackage(ServicePackage serPackage) {
        this.serPackage = serPackage;
    }

    /**
     * 获取
     *
     * @return customerAmount
     */
    public double getCustomerAmount() {
        return customerAmount;
    }

    /**
     * 设置
     *
     * @param customerAmount
     */
    public void setCustomerAmount(double customerAmount) {
        this.customerAmount = customerAmount;
    }

    /**
     * 获取
     *
     * @return realTalkTime
     */
    public int getRealTalkTime() {
        return realTalkTime;
    }

    /**
     * 设置
     *
     * @param realTalkTime
     */
    public void setRealTalkTime(int realTalkTime) {
        this.realTalkTime = realTalkTime;
    }

    /**
     * 获取
     *
     * @return realSMSCount
     */
    public int getRealSMSCount() {
        return realSMSCount;
    }

    /**
     * 设置
     *
     * @param realSMSCount
     */
    public void setRealSMSCount(int realSMSCount) {
        this.realSMSCount = realSMSCount;
    }

    /**
     * 获取
     *
     * @return realFlow
     */
    public int getRealFlow() {
        return realFlow;
    }

    /**
     * 设置
     *
     * @param realFlow
     */
    public void setRealFlow(int realFlow) {
        this.realFlow = realFlow;
    }

    public String toString() {
        return "MobileCard{userName = " + userName + ", passWord = " + passWord + ", cardNumber = " + cardNumber + ", serPackage = " + serPackage + ", customerAmount = " + customerAmount + ", realTalkTime = " + realTalkTime + ", realSMSCount = " + realSMSCount + ", realFlow = " + realFlow + "}";
    }
}
