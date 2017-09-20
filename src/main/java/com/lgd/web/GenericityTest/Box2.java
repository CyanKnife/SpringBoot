package com.lgd.web.GenericityTest;

/**
 * Author : linguodong
 * Create : 2017/8/10
 * Update : 2017/8/10
 * Descriptions :
 */
public class Box2<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box2<Integer> integerBox2 = new Box2<>();
        Box2<Double> doubleBox2 = new Box2<>();
        Box2<String> stringBox2 = new Box2<>();
    }
}
// 这样我们的Box类便可以得到复用，我们可以将T替换成任何我们想要的类型

