package com.loki.developerbase.single;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例-在第一次调用的时候实例化自己
 * 注意：懒汉式单例是线程不安全的，并发环境下很可能出现多个Sington实例。
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton = null;

    // 静态工厂方法
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
