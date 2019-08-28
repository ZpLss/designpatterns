package com.designpatterns.decoratorpattern;

/**
 * 装饰者模式：动态的给对象添加一些额外的职责，扩展对象的功能，是继承关系的一个替代方案
 * 装饰者模式的设计原则为：对扩展开放、对修改关闭，装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为。
 * 如果想扩展被装饰者类的行为，无须修改装饰者抽象类，只需继承装饰者抽象类，实现额外的一些装饰或者叫行为即可对被装饰者
 * 进行包装。所以：扩展体现在继承、修改体现在子类中，而不是具体的抽象类
 * 角色组成
 * 1、抽象接口：规范 装饰者 与 被装饰者
 * 2、被装饰者：需要扩展功能的对象
 * 3、装饰者(抽象类)：装饰者的规范
 * 4、具体的装饰者：继承装饰者的子类
 */
public abstract class Decorator implements Drinks{

}