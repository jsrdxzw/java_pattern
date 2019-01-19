package com.natsuki;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author xuzhiwei
 * created at 2018-11-26
 */
public class TestSIngleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");
        PerfectSingleton instance = PerfectSingleton.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        File file = new File("singleton_file");
        outputStream.writeObject(instance);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        PerfectSingleton newInstance= (PerfectSingleton) inputStream.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        Class clazz = PerfectSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
//        PerfectSingleton instance = PerfectSingleton.getInstance();
//        PerfectSingleton newInstance = (PerfectSingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        PerfectSingleton instance = PerfectSingleton.getInstance();
    }
}
