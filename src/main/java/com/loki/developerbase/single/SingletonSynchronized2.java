package com.loki.developerbase.single;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例双重检查锁定，解决线程安全问题
 */
public class SingletonSynchronized2 {

    private SingletonSynchronized2() {
    }

    private static SingletonSynchronized2 singleton;

    public static SingletonSynchronized2 getInstance() {
        if (singleton == null) {
            synchronized (SingletonSynchronized2.class) {
                if (singleton == null) {
                    singleton = new SingletonSynchronized2();
                }
            }
        }
        return singleton;
    }

}
