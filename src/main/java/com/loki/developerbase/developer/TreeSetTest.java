package com.loki.developerbase.developer;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author xujs
 */
public class TreeSetTest {

    @Test
    public void treeSet1() {
        Set set = new TreeSet();
        set.add("KK");
        set.add("AA");
        set.add("OO");
        set.add("OO");
        set.add("EE");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
