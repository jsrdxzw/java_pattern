package com.natsuki;

import java.io.Serializable;

/**
 * @author xuzhiwei
 * created at 2018-11-26
 */
public class PerfectSingleton implements Serializable {
    private static class InnerClass{
        private final static PerfectSingleton INSTANCE = new PerfectSingleton();
    }
    private PerfectSingleton(){
        System.out.println("hoho");
        if (InnerClass.INSTANCE!=null){
            throw new RuntimeException("禁止反射调用");
        }
    }

    public static PerfectSingleton getInstance(){
        return InnerClass.INSTANCE;
    }

}
