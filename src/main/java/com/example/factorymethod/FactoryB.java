package com.example.factorymethod;

public class FactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }    
}
