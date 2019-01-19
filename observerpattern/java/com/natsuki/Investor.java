package com.natsuki;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xuzhiwei
 * created at 2018-12-13
 */
public class Investor implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Share share = (Share) o;
        if (share != null) {
            double price = (double) arg;
            System.out.println(this.name+"收到通知，股票目前价格：" + price);
        }
    }
}
