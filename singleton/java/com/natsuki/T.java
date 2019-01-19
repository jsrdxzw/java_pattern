package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-26
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+lazySingleton);
    }
}
