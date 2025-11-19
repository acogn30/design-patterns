package com.example.singleton;

public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void hello() {
        System.out.println("Hello from Eager Singleton!");
    }
}

