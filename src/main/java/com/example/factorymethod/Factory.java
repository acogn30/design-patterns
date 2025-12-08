package com.example.factorymethod;

public abstract class Factory {
    public abstract Product createProduct();
    public void process() {
        Product product = createProduct();
        product.use();
    }
}
