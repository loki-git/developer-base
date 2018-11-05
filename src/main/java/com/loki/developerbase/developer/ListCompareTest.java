package com.loki.developerbase.developer;

import java.util.*;

/**
 * @Author xujs
 * 对比ArrayList和LinkedList的插入、随机读取效率、删除的效率
 *
 * ArrayList 是一个数组队列，相当于动态数组。它由数组实现，随机访问效率高，随机插入、随机删除效率低。
 * LinkedList 是一个双向链表。它也可以被当作堆栈、队列或双端队列进行操作。LinkedList随机访问效率低，但随机插入、随机删除效率高。
 * Vector 是矢量队列，和ArrayList一样，它也是一个动态数组，由数组实现。但是ArrayList是非线程安全的，而Vector是线程安全的。
 * Stack 是栈，它继承于Vector。它的特性是：先进后出(FILO, First In Last Out)。
 */
public class ListCompareTest {

    private static final int COUNT = 100000;

    private static LinkedList linkedList = new LinkedList();
    private static ArrayList arrayList = new ArrayList();
    private static Vector vector = new Vector();
    private static Stack stack = new Stack();

    public static void main(String[] args) {
        // 插入
        System.out.println("---------------------插入--------------------");
        insertByPosition(stack);
        insertByPosition(vector);
        insertByPosition(arrayList);
        insertByPosition(linkedList);

        // 随机读取
        System.out.println("----------------------读取--------------------");
        readByPosition(stack);
        readByPosition(vector);
        readByPosition(arrayList);
        readByPosition(linkedList);

        // 删除
        System.out.println("-----------------------删除-------------------");
        deleteByPosition(stack);
        deleteByPosition(vector);
        deleteByPosition(arrayList);
        deleteByPosition(linkedList);
    }

    /**
     * 获取List的名称
     */
    private static String getListName(List list) {
        if (list instanceof LinkedList) {
            return "LinkedList";
        } else if (list instanceof ArrayList) {
            return "ArrayList";
        } else if (list instanceof Vector) {
            return "Vector";
        } else if (list instanceof Stack) {
            return "Stack";
        } else {
            return "List";
        }
    }

    /**
     * 向List的指定位置插入COUNT个元素，并统计时间
     */
    private static void insertByPosition(List list) {
        long start = System.currentTimeMillis();

        // 向List的位置0插入COUNT个元素
        for (int i = 0; i < COUNT; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        long interval = end - start;

        System.out.println(getListName(list) + " : insert " + COUNT + "elements into the first position use times:" + interval + "ms");
    }

    /**
     * 从List的指定位置删除COUNT个元素，并统计时间
     */
    private static void deleteByPosition(List list) {
        long start = System.currentTimeMillis();

        // 删除list第一个位置元素
        for (int i = 0; i < 100000; i++) {
            list.remove(0);
        }

        long end = System.currentTimeMillis();
        long interval = end - start;
        System.out.println(getListName(list) + " : delete " + COUNT + "elements use times:" + interval + "ms");
    }

    /**
     * 根据position,不断从list中读取元素,并统计时间
     */
    private static void readByPosition(List list) {
        long start = System.currentTimeMillis();

        // 读取list元素
        for (int i = 0; i < COUNT; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis();
        long interval = end - start;

        System.out.println(getListName(list) + " : read " + COUNT + "elements user times:" + interval + "ms");
    }
}
