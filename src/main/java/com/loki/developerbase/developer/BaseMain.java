package com.loki.developerbase.developer;

/**
 * @Author xujs
 */
public class BaseMain {

    public int string;

    public static void main(String[] args) {
        BaseMain baseMain = new BaseMain();
        System.out.println(baseMain.string);

        String s = "";
        System.out.println(s.trim());

        String str = "Hello";

        StringBuffer strBuffer = new StringBuffer("");

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("hello");
        strBuilder.insert(3, "wo");

        System.out.println(str);
        System.out.println(strBuffer);
        System.out.println(strBuilder);

        System.out.println(WeekEnum.MONDAY.getTypeName());
    }

}
