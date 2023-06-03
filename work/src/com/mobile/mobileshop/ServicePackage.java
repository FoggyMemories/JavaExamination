package com.mobile.mobileshop;

public abstract class ServicePackage {

    private int talkTime;
    private int flow;
    private int smsCount;
    private double price;
    private double allPay;
    private Object pack;

    public ServicePackage() {
    }

    public ServicePackage(int talkTime, int flow, int smsCount, double price, double allPay, Object pack) {
        this.talkTime = talkTime;
        this.flow = flow;
        this.smsCount = smsCount;
        this.price = price;
        this.allPay = allPay;
        this.pack = pack;
    }

    /**
     * 获取
     *
     * @return talkTime
     */
    public int getTalkTime() {
        return talkTime;
    }

    /**
     * 设置
     *
     * @param talkTime
     */
    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    /**
     * 获取
     *
     * @return flow
     */
    public int getFlow() {
        return flow;
    }

    /**
     * 设置
     *
     * @param flow
     */
    public void setFlow(int flow) {
        this.flow = flow;
    }

    /**
     * 获取
     *
     * @return smsCount
     */
    public int getSmsCount() {
        return smsCount;
    }

    /**
     * 设置
     *
     * @param smsCount
     */
    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    /**
     * 获取
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return allPay
     */
    public double getAllPay() {
        return allPay;
    }

    /**
     * 设置
     *
     * @param allPay
     */
    public void setAllPay(double allPay) {
        this.allPay = allPay;
    }

    /**
     * 获取
     *
     * @return pack
     */
    public Object getPack() {
        return pack;
    }

    /**
     * 设置
     *
     * @param pack
     */
    public void setPack(Object pack) {
        this.pack = pack;
    }

    public String toString() {
        return "ServicePackage{talkTime = " + talkTime + ", flow = " + flow + ", smsCount = " + smsCount + ", price = " + price + ", allPay = " + allPay + ", pack = " + pack + "}";
    }
}
