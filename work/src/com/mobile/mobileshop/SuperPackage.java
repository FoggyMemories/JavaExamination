package com.mobile.mobileshop;

public class SuperPackage extends ServicePackage {
    private int talkTime;
    private int smsCount;
    private int flow;
    private double price;

    public SuperPackage() {
    }

    public SuperPackage(int talkTime, int smsCount, int flow, double price) {
        this.talkTime = talkTime;
        this.smsCount = smsCount;
        this.flow = flow;
        this.price = price;
    }

    /**
     * 获取
     * @return talkTime
     */
    public int getTalkTime() {
        return talkTime;
    }

    /**
     * 设置
     * @param talkTime
     */
    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    /**
     * 获取
     * @return smsCount
     */
    public int getSmsCount() {
        return smsCount;
    }

    /**
     * 设置
     * @param smsCount
     */
    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    /**
     * 获取
     * @return flow
     */
    public int getFlow() {
        return flow;
    }

    /**
     * 设置
     * @param flow
     */
    public void setFlow(int flow) {
        this.flow = flow;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "通话时间:" + talkTime + ",信息条数:" + smsCount + ",价格:" + price + ",流量:" + flow;
    }
}
