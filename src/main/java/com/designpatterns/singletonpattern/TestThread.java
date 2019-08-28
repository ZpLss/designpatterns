package com.designpatterns.singletonpattern;

public class TestThread extends Thread {
    @Override
    public void run() {
        // 对于不同单例模式的实现，只需更改相应的单例类名及其公有静态工厂方法名即可
        int hash = LazySingleton.getInstance().hashCode();
        System.out.println(hash);
    }

}
