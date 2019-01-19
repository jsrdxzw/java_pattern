package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-03
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        AbstractIgoChessman b = IgoChessmanFactory.getIgoChessman("b");
        AbstractIgoChessman b1 = IgoChessmanFactory.getIgoChessman("b");
        AbstractIgoChessman b2 = IgoChessmanFactory.getIgoChessman("b");


        b.display(new Coordinates(1,2));
        b1.display(new Coordinates(3,4));
        b2.display(new Coordinates(5,8));

        System.out.println(b==b2);
    }
}
