package com.mobile.mobileshop;

public abstract class ServicePackage {
    protected double price;
    public Object pack;

    public ServicePackage() {
    }

    public ServicePackage(double price, Object pack) {
        this.price = price;
        this.pack = pack;
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
}
