package com.designpatterns.adaperpattern;

/**
 * Target（目标抽象类）：
 *      目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类。
 * 工作要求，需要会三种语言
 */
public interface Job {

    void speakEnglish();

    void speakChinese();

    void speakGerman();
}
