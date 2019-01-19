package com.natsuki;

import java.util.Observable;

/**
 * @author xuzhiwei
 * created at 2018-12-13
 */
public class Share extends Observable {

    private String shareName;
    private double price;

    public Share(String shareName, double price) {
        this.shareName = shareName;
        this.price = price;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (Math.abs(price-this.price) / this.price > 0.05){
            this.notifySharePrice();
        }
        this.price = price;
    }

    private void notifySharePrice(){
        System.out.println(this.shareName + "股票价格变化");
        setChanged();
        this.notifyObservers(this.price);
    }
}
