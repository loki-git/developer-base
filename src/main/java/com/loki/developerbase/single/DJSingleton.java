package com.loki.developerbase.single;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xujs
 * 设计模式-单例模式(登记式单例)
 * 类似Spring里面的方法，将类名注册，下次从里面获取
 *
 * 登记式单例实际上维护了一组单例的实例，将这些实例存放在一个Map(登记蒲)中，对于已经登记过的实例，则从Map直接返回，对于没有登记的，则先登记，然后返回。
 */
public class DJSingleton {

    private static Map<String, DJSingleton> map = new HashMap<>();

    static {
        DJSingleton singleton = new DJSingleton();
        map.put(singleton.getClass().getName(), singleton);
    }

    // 保护的默认构造
    protected DJSingleton() {
    }

    /**
     * 静态的工厂方法，返还此类唯一的实例
     * @param name
     * @return
     */
    public static DJSingleton getInstance(String name) {
        if (name == null) {
            name = DJSingleton.class.getName();
            System.out.println("name == null" + "--->name=" + name);
        }

        if (map.get(name) == null) {
            try {
                map.put(name, (DJSingleton) Class.forName(name).newInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return map.get(name);
    }

    // 一个示意性的商业方法
    public String about() {
        return "Hello, I am Singleton...";
    }

    public static void main(String[] args) {
        DJSingleton singleton = DJSingleton.getInstance(null);
        System.out.println(singleton.about());
    }

}
