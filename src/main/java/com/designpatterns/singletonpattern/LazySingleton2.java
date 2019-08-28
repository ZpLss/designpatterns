package com.designpatterns.singletonpattern;

/**
 * 懒汉式单例模式
 */
public class LazySingleton2 {

    /**
     * synchronized方法  效率比较低
     */
//    private LazySingleton2 (){}
//    private static LazySingleton2 singleton;
//    //使用 synchronized 修饰，临界资源的同步互斥访问,效率不高，线程安全
//    public static synchronized LazySingleton2 getInstance(){
//        if (null == singleton){
//            singleton = new LazySingleton2();
//        }
//        return singleton;
//    }

    /**
     * 内部类写法
     */
//    private LazySingleton2 (){}
//    private static class Singleton {
//        private static LazySingleton2 singleton2 = new LazySingleton2();
//    }
//    public static LazySingleton2 getInstance(){
//        return Singleton.singleton2;
//    }

    /**
     * 双重检查
     * volatile 可以保证变量的  有序性  和  可见性
     * 使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作
     * 在并发情况下，如果没有volatile关键字，在第5行会出现问题。instance = new TestInstance();可以分解为3行伪代码
     * 1.memory = allocate()   //分配内存
     * 2. ctorInstanc(memory)   //初始化对象
     * 3. instance = memory  //设置instance指向刚分配的地址
     * 下面的代码在编译运行时，可能会出现重排序从1-2-3排序为1-3-2。在多线程的情况下会出现以下问题。
     * 线程A在执行第5行代码时，B线程进来，而此时A执行了1和3，没有执行2，此时B线程判断instance不为null，直接返回一个未初始化的对象。
     */
    private LazySingleton2() {
    }

    private static volatile LazySingleton2 lazySingleton2;

    public static LazySingleton2 getInstance() {
        if (null == lazySingleton2) {
            synchronized (LazySingleton2.class) {
                if (null == lazySingleton2) {
                    lazySingleton2 = new LazySingleton2();//5
                }
            }
        }
        return lazySingleton2;
    }
}
