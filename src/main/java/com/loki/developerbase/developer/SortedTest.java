package com.loki.developerbase.developer;

import org.junit.Test;

/**
 * @ClassName SortedTest
 * @Desc
 * @Author xujs
 * @Date 2018/10/25 14:56
 * @Version 1.0
 */
public class SortedTest {

    /**
     * 冒泡排序
     */
    @Test
    public void test() {
        int tmp = 0;
        int[] array = {288, 11, 900, 373, 87, 1712, 78};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 选择排序
     */
    @Test
    public void test1() {
        int tmp;
        int minIndex;
        int[] array = {288, 11, 900, 373, 87, 1712, 78};
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    tmp = array[minIndex];
                    array[minIndex] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 插入排序
     */
    @Test
    public void test3() {
        int tmp = 0;
        int j;
        int[] array = {288, 11, 900, 373, 87, 1712, 78};
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
