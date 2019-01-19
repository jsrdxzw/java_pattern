package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-26
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){}
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
