package com.example.factorymethod;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
    
    @Test
    void testFactoryA() {
        Factory factory = new FactoryA();
        Product product = factory.createProduct();
        assertTrue(product instanceof ConcreteProductA);
    }

    @Test
    void testFactoryB() {
        Factory factory = new FactoryB();
        Product product = factory.createProduct();
        assertTrue(product instanceof ConcreteProductB);
    }
}
