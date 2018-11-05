package com.loki.developerbase.single;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例静态内部类，解决线程安全问题
 * 该方式既实现了线程安全，又避免了同步带来的性能影响
 */
public class SingletonStatic {

    private static class LazyHolder {
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    private SingletonStatic() {
    }

    public static final SingletonStatic getInstance() {
        return LazyHolder.INSTANCE;
    }

}
