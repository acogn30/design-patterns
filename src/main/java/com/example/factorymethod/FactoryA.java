package com.example.factorymethod;

public class FactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }    
}
