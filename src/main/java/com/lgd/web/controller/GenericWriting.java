package com.lgd.web.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : linguodong
 * Create : 2017/7/19
 * Update : 2017/7/19
 * Descriptions :
 */
public class GenericWriting {
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();

    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruit, new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
