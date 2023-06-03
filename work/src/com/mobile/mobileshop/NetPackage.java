package com.mobile.mobileshop;

public class NetPackage extends ServicePackage {
    private int flow;
    private double price;

    public NetPackage() {
    }

    public NetPackage(int flow, double price) {
        this.flow = flow;
        this.price = price;
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
        return "流量:" + flow + ",价格:" + price;
    }
}
