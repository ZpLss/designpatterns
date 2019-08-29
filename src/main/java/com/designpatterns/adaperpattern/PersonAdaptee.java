package com.designpatterns.adaperpattern;

/**
 * 一个人，只会英语和汉语，不会德语
 */
public class PersonAdaptee {
    private String name;
    private Integer aga;

    public void speakEnglish(){
        System.out.println("说英语");
    }

    public void speakChinese(){
        System.out.println("说汉语");
    }

}
