package com.loki.developerbase.single;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例在getInstance方法上加同步，解决线程安全问题
 */
public class SingletonSynchronized {

    private SingletonSynchronized() {
    }

    private static SingletonSynchronized singleton = null;

    public static synchronized SingletonSynchronized getInstance() {
        if (singleton == null) {
            singleton = new SingletonSynchronized();
        }
        return singleton;
    }

}
