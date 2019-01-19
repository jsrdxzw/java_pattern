package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-13
 */
public class ObserverTest {
    public static void main(String[] args) {
        Investor investor = new Investor();
        investor.setName("Yang");

        Investor investor2 = new Investor();
        investor2.setName("Xu");

        Share share = new Share("天虹股票",10);

        share.addObserver(investor);
        share.addObserver(investor2);

        share.setPrice(100);
    }
}
