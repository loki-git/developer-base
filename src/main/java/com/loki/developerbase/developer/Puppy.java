package com.loki.developerbase.developer;

/**
 * @Author xujs
 */
public class Puppy {

    public Puppy(String name) {
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }

    public static void main(String[] args) {
        // 下面的语句将创建一个Puppy对象
        // 1、Puppy myPuppy 声明一个对象myPuppy，这个对象的类型是Puppy
        // 2、new Puppy()使用关键字new创建一个对象Puppy
        // 3、调用构造方法public Puppy(String name) {}初始化对象
        Puppy myPuppy = new Puppy("tommy");
    }

}
