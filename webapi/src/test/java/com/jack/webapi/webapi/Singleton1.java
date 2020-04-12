package com.jack.webapi.webapi;

/**
 * @author Jack
 * 饿汉式单例模式，不存在线程安全
 */
public class Singleton1 {
    /**
     * 1、直接实例化
     * 2、枚举式实例化
     */
    public static Singleton1 INSTANCE = new Singleton1();


    /**
     * 私有化构造
     */
    private Singleton1() {
    }

    public void doJob() {
        System.out.println("====do something ...====");
    }
}
