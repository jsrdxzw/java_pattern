package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-26
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
    private StaticInnerClassSingleton(){}
}
