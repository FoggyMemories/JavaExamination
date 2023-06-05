package com.mobile.topmenu;

public class BillingDescription {
    private double talkPrice;
    private double flowPrice;
    private double SMSPrice;


    public BillingDescription() {
    }

    public BillingDescription(double talkPrice, double flowPrice, double SMSPrice) {
        this.talkPrice = talkPrice;
        this.flowPrice = flowPrice;
        this.SMSPrice = SMSPrice;
    }

    /**
     * 获取
     *
     * @return talkPrice
     */
    public double getTalkPrice() {
        return talkPrice;
    }

    /**
     * 设置
     *
     * @param talkPrice
     */
    public void setTalkPrice(double talkPrice) {
        this.talkPrice = talkPrice;
    }

    /**
     * 获取
     *
     * @return flowPrice
     */
    public double getFlowPrice() {
        return flowPrice;
    }

    /**
     * 设置
     *
     * @param flowPrice
     */
    public void setFlowPrice(double flowPrice) {
        this.flowPrice = flowPrice;
    }

    /**
     * 获取
     *
     * @return SMSPrice
     */
    public double getSMSPrice() {
        return SMSPrice;
    }

    /**
     * 设置
     *
     * @param SMSPrice
     */
    public void setSMSPrice(double SMSPrice) {
        this.SMSPrice = SMSPrice;
    }

    public String toString() {
        return "BillingDescription{talkPrice = " + talkPrice + ", flowPrice = " + flowPrice + ", SMSPrice = " + SMSPrice + "}";
    }
}
