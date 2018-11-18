package com.loki.developerbase.developer;

/**
 * @Author xujs
 */
public class OverloadingMain {

    public int test() {
        System.out.println("1");
        return 1;
    }

    public void test(int num) {
        System.out.println("2");
    }

    public String test(String str, int num) {
        System.out.println(str);
        return "3";
    }

    public String test(int num, String str) {
        return "4";
    }

}
