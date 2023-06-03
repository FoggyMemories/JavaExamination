package com.mobile.mobileshop;

public class TalkPackage extends ServicePackage {
    private int talkTime;
    private int smsCount;
    private double price;

    public TalkPackage() {
    }

    public TalkPackage(int talkTime, int smsCount, double price) {
        this.talkTime = talkTime;
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
        return "通话时间:" + talkTime + ",信息条数:" + smsCount + ",价格:" + price;
    }
}
