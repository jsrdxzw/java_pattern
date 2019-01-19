package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-26
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    private LazyDoubleCheckSingleton() {
    }
}
