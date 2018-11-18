package com.loki.developerbase.developer;

/**
 * @Author xujs
 */
public class Dog extends Animal {

    @Override
    public void move() {
        super.move();
        System.out.println("狗可以跑和走");
    }

    public void bark() {
        System.out.println("狗可以吠叫");
    }

}
