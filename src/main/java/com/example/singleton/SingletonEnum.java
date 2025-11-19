package com.example.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void hello() {
        System.out.println("Hello from Enum Singleton");
    }
}
