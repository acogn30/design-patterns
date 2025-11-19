package com.example.singleton;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SingletonTest {
    
    @Test
    void placeholderTest(){
        assertTrue(true);
    }

    @Test
    void testEagerSingleton() {
        SingletonEager a = SingletonEager.getInstance();
        SingletonEager b = SingletonEager.getInstance();
        assertSame(a, b);
    }

    @Test
    void testLazySingleton() {
        SingletonLazy a = SingletonLazy.getInstance();
        SingletonLazy b = SingletonLazy.getInstance();
        assertSame(a, b);
    }

    @Test
    void testDCLSingleton() {
        SingletonDCL a = SingletonDCL.getInstance();
        SingletonDCL b = SingletonDCL.getInstance();
        assertSame(a, b);
    }

    @Test
    void testEnumSingleton() {
        SingletonEnum a = SingletonEnum.INSTANCE;
        SingletonEnum b = SingletonEnum.INSTANCE;
        assertSame(a, b);
    }
}
