package com.loki.developerbase.fortest;

import org.junit.Test;

/**
 * @Author xujs
 */
public class ForMain {

    public static void main(String[] args) {
        for (int i = 1; i <= 150 ; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.print("foo ");
            }

            if (i % 5 == 0) {
                System.out.print("biz ");
            }

            if (i % 7 == 0) {
                System.out.print("baz ");
            }

            System.out.println();
        }
    }

    @Test
    public void qishu() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void test() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                count += 1;
                sum += i;
            }
        }

        System.out.println(count);
        System.out.println(sum);
    }

    /**
     * *****
     * *****
     * *****
     * *****
     * *****
     */
    @Test
    public void test01() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * ****
     * ***
     * **
     * *
     */
    @Test
    public void test02() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * *
     * **
     * ***
     * ****
     */
    @Test
    public void test03() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * *
     * **
     * ***
     * ****
     * *****
     * ****
     * ***
     * **
     * *
     */
    @Test
    public void test04() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     *
     *    * *
     *   * * *
     *  * * * *
     * * * * * *
     *  * * * *
     *   * * *
     *    * *
     *     *
     */
    @Test
    public void test05() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4 - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
