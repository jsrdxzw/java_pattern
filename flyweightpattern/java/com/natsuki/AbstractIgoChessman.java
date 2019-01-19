package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-03
 */
public abstract class AbstractIgoChessman {

    public abstract String getColor();

    public void display(Coordinates coordinates){
        System.out.println("妻子的颜色："+this.getColor()+"妻子的位置"+coordinates.getX()+","+coordinates.getY());
    }
}
