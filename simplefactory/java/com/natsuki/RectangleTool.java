package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018/11/21
 */
public class RectangleTool implements GeometryTool {
    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除方形");
    }
}
