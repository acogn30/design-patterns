package com.example.singleton;

public class SingletonDCL {

/**
 * Thread-safe Lazy Singleton using Double-Checked Locking.
 * Requires 'volatile' to prevent instruction reordering (JMM).
 * volatile 確保物件初始化不會被重排序，避免其他執行緒拿到尚未初始化完成的 instance
 */    
    private static volatile SingletonDCL instance;

    private SingletonDCL() {}

    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

    public void hello() {
        System.out.println("Hello from DCL Singleton!");
    }
}