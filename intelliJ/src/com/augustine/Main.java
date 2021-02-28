package com.augustine;

import com.augustine.model.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        Product product = new Product("Monitor");

        System.out.println(product.getName());
    }
}
