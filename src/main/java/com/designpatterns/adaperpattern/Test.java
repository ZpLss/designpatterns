package com.designpatterns.adaperpattern;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 类适配器模式
         */
        ClassAdapter a = new ClassAdapter();
        a.speakChinese();
        a.speakEnglish();
        a.speakGerman();

        /**
         * 对象适配模式
         */
        PersonAdaptee person = new PersonAdaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(person);
        objectAdapter.speakChinese();
        objectAdapter.speakEnglish();
        objectAdapter.speakGerman();

        /**
         * 默认适配模式
         */
        DefaultAdapter defaultAdapter = new DefaultAdapter();
        defaultAdapter.playBall();
        defaultAdapter.sing();
        defaultAdapter.dance();


    }
}
