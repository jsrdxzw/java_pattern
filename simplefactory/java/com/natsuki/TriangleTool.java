package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018/11/21
 */
public class TriangleTool implements GeometryTool {
    @Override
    public void draw() {
        System.out.println("绘制三角");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角");
    }
}
