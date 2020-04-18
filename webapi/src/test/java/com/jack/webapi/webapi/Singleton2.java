package com.jack.webapi.webapi;

/**
 * @author Jack
 * 懒汉单例模式，不存在线程安全
 */
public class Singleton2 {
    /**
     * 1、直接实例化
     * 2、枚举式实例化
     */
    public static Singleton2 INSTANCE;

    static {
        //init property
    }

    /**
     * 私有化构造
     */
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
}