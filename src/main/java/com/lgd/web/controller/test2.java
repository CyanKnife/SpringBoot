package com.lgd.web.controller;

import java.util.Arrays;
import java.util.List;

/**
 * Author : linguodong
 * Create : 2017/7/19
 * Update : 2017/7/19
 * Descriptions :
 */
public class test2 {
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f2() {
        CovariantReader<Fruit> fruitReader = new CovariantReader<Fruit>();
        Fruit f = fruitReader.readCovariant(fruit);
        Fruit a = fruitReader.readCovariant(apples);
    }

    public static void main(String[] args) {
        f2();
    }


}


class Fruit {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}