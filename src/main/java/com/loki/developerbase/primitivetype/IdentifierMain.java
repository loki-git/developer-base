package com.loki.developerbase.primitivetype;

/**
 * @Author xujs
 */
public class IdentifierMain {

    public void pupAge() {
        // int age;
        // age = age + 7; 编译报错Variable 'age' might not have been initialized，age变量没有初始化

        int age = 0;
        age = age + 7;
        System.out.println("age:" + age);

    }

    public static void main(String[] args) {
        IdentifierMain identifierMain = new IdentifierMain();
        identifierMain.pupAge();
    }

}
