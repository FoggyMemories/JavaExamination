package com.mobile.mobileshop;

public abstract class AllServicePackage {

    private int talkTime;
    private int flow;
    private int smsCount;
    private double price;


    public AllServicePackage() {
    }

    /**
     * @param talkTime 用户通话时长
     * @param flow     用户使用流量
     * @param smsCount 用户短信发送条数
     * @param price    套餐价位
     */
    public AllServicePackage(int talkTime, int flow, int smsCount, double price) {
        this.talkTime = talkTime;
        this.flow = flow;
        this.smsCount = smsCount;
        this.price = price;
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


    public String toString() {
        return "ServicePackage{talkTime = " + talkTime + ", flow = " + flow + ", smsCount = " + smsCount + ", price = " + price + "}";
    }
}
