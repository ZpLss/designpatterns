package com.designpatterns.singletonpattern;

public class Test {

    public static void main(String[] args) {

        //模拟多线程，如果每个线程获取的对象的hashCode值是一样的，则证明获取到对象是单例
        for (int i = 1; i <= 20; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
//                    System.out.println(HungrySingleton.getHungrySingleton().hashCode());
//                    System.out.println(LazySingleton.getInstance().hashCode());
                    System.out.println(LazySingleton2.getInstance().hashCode());
                }
            });
            thread.start();
        }
//        Thread[] threads = new Thread[10];
//        for (int i = 0; i < threads.length; i++) {
//            threads[i] = new TestThread();
//        }
//        for (int i = 0; i < threads.length; i++) {
//            threads[i].start();
//        }

    }
}
