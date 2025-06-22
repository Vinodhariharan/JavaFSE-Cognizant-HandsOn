package com.example.util;

public class ForecastUtil {

    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        return forecastRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

}