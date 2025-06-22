package com.example.main;

import com.example.model.Product;
import com.example.util.SearchUtil;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shampoo", "Personal Care"),
            new Product(3, "Book", "Education"),
            new Product(4, "Smartphone", "Electronics"),
            new Product(5, "Shoes", "Footwear")
        };

        String searchTerm = "Smartphone";

        Product linearResult = SearchUtil.linearSearch(products, searchTerm);
        printResult("Linear Search", linearResult);


        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        Product binaryResult = SearchUtil.binarySearch(products, searchTerm);
        printResult("Binary Search", binaryResult);
    }

    private static void printResult(String method, Product result) {
        if (result != null) {
            System.out.println(method + " Result: Found " + result.getProductName() + " in category " + result.getCategory());
        } else {
            System.out.println(method + " Result: Product not found");
        }
    }
}
