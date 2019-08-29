package com.designpatterns.adaperpattern;

/**
 * 对象适配器模式，适配器与适配者之间的关系是关联关系
 * 优点：
 *      1、一个对象适配器可以把多个不同的适配者适配到同一个目标；
 *      2、可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，根据“里氏代换原则”，适配者的子类
 *      也可通过该适配器进行适配。
 * 缺点：
 *      与类适配器模式相比，要在适配器中置换适配者类的某些方法比较麻烦。如果一定要置换掉适配者类的一个或多个方法，
 *      可以先做一个适配者类的子类，将适配者类的方法置换掉，然后再把适配者类的子类当做真正的适配者进行适配，
 *      实现过程较为复杂。
 *
 */
public class ObjectAdapter implements Job{

    private PersonAdaptee person;

    public ObjectAdapter(PersonAdaptee person) {
        this.person = person;
    }

    @Override
    public void speakEnglish() {
        person.speakEnglish();
    }

    @Override
    public void speakChinese() {
        person.speakChinese();
    }

    @Override
    public void speakGerman() {
        System.out.println("讲德语");
    }
}
