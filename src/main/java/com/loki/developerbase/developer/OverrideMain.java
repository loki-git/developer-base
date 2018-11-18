package com.loki.developerbase.developer;

/**
 * @Author xujs
 */
public class OverrideMain {

    public static void main(String[] args) {
        //Animal animal = new Animal();
        //animal.move();

        // Animal是引用类型
        Animal animal1 = new Dog();
        // 为什么运行的是Dog中的move方法？
        animal1.move();

        // 由于在编译阶段，只是检查参数的引用类型，
        // 然而在运行时，java虚拟机（JVM）指定对象的类型并且运行该对象的方法。
        // 因此在上面的例子中，之所以能编译成功，是因为Animal类中存在move()方法，然而运行时，运行的是特定对象的方法。

        // animal1.bark(); 编译失败，因为animal1的引用类型Animal没有bark()方法。
    }

}
