package com.designpatterns.singletonpattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LazySingletonTest {

    @Test
    public void getInstance() {
    }

    @Test
    public void sentNotice() {
        LazySingleton instance = LazySingleton.getInstance();
        assertEquals("haha", instance.sentNotice("haha"));

    }
}