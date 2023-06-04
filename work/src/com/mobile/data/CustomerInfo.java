package com.mobile.data;

import com.mobile.mobileshop.ServicePackage;

public class CustomerInfo {
    private String cardNumber;
    private String type;
    private String userName;
    private String passWord;
    private int consumerDate;
    private ServicePackage serPackage;
    private double customerAmount;
    private int realTalkTime;
    private int realSMSCount;
    private int realFlow;
    private int allPay;


    public CustomerInfo() {
    }

    public CustomerInfo(String cardNumber, String userName, String passWord, ServicePackage serPackage) {
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.passWord = passWord;
        this.serPackage = serPackage;
    }

    /**
     *
     * @param cardNumber     卡号
     * @param type           套餐类型(字符串)
     * @param userName       用户名
     * @param passWord       密码
     * @param consumerDate   用户数据
     * @param serPackage     套餐类型
     * @param customerAmount 账户余额
     * @param realTalkTime   实际通话时长
     * @param realSMSCount   实际短信条数
     * @param realFlow       实际使用流量
     * @param allPay         需要的额外支出
     */
    public CustomerInfo(String cardNumber, String type, String userName, String passWord, int consumerDate, ServicePackage serPackage, double customerAmount, int realTalkTime, int realSMSCount, int realFlow, int allPay) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.userName = userName;
        this.passWord = passWord;
        this.consumerDate = consumerDate;
        this.serPackage = serPackage;
        this.customerAmount = customerAmount;
        this.realTalkTime = realTalkTime;
        this.realSMSCount = realSMSCount;
        this.realFlow = realFlow;
        this.allPay = allPay;
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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     *
     * @return consumerDate
     */
    public int getConsumerDate() {
        return consumerDate;
    }

    /**
     * 设置
     *
     * @param consumerDate
     */
    public void setConsumerDate(int consumerDate) {
        this.consumerDate = consumerDate;
    }

    public String toString() {
        return "CustomerInfo{cardNumber = " + cardNumber + ", type = " + type + ", consumerDate = " + consumerDate + "}";
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

    /**
     * 获取
     *
     * @return allPay
     */
    public int getAllPay() {
        return allPay;
    }

    /**
     * 设置
     *
     * @param allPay
     */
    public void setAllPay(int allPay) {
        this.allPay = allPay;
    }
}
