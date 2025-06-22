package com.example.main;

import com.example.util.ForecastUtil;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000.0; // Starting amount
        double growthRate = 0.1;       // 10% growth
        int years = 5;

        double resultRecursive = ForecastUtil.forecastRecursive(initialValue, growthRate, years);
        System.out.printf("Recursive Forecast (Year %d): %.2f%n", years, resultRecursive);

     
    }
}