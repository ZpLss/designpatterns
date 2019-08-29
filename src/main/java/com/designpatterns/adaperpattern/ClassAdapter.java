package com.designpatterns.adaperpattern;

/**
 * 适配器模式
 *      将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作。
 *      适配就是由“源”到“目标”的适配，而当中链接两者的关系就是适配器。
 *      适配器模式可分为对象适配器和类适配器两种，
 *              在对象适配器模式中，适配器与适配者之间是关联关系；
 *              在类适配器模式中，适配器与适配者之间是继承（或实现）关系。
 *       角色
 *      1、Target（目标抽象类）：目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类。
 *      2、Adapter（适配器类）：适配器可以调用另一个接口，作为一个转换器，对Adaptee和Target进行适配，
 *      适配器类是适配器模式的核心，在对象适配器中，它通过实现Target接口并关联或继承一个Adaptee对象使二者产生联系。
 *      3、Adaptee（适配者类）：适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类一般是
 *      一个具体类，包含了客户希望使用的业务方法，在某些情况下可能没有适配者类的源代码。
 */

/**
 * 类适配器模式，适配器与适配者之间是继承（或实现）关系，由于类的单继承特性，类适配器只可以对一个类进行适配
 *      适配器让person可以满足Job的需要，适配器就是桥梁，
 *  优点：
 *      由于适配器类是适配者类的子类，因此可以在适配器类中置换一些适配者的方法，使得适配器的灵活性更强。
 *  缺点：
 *      1、对于Java不支持多继承，一次最多只能适配一个适配者类，不能同时适配多个适配者；
 *      2、适配者类不能为最终类，如在Java中不能为final类；
 *      3、在Java中，类适配器模式中的目标抽象类只能为接口，不能为类，其使用有一定的局限性。
 */
public class ClassAdapter extends PersonAdaptee implements Job {

    @Override
    public void speakGerman() {
        System.out.println("讲德语");
    }
}
