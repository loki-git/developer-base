package com.loki.developerbase.abstractandinterface;

/**
 * @Author xujs
 */
public class AbstractDemo {

    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --   --1");
        s.mailCheck();

        System.out.println(s.computePay());

        System.out.println("\n Call mailCheck using Employee reference--  4");
        e.mailCheck();
    }

}
