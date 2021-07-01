package com.company;

import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float WeightInPound = (float)168.67;
        double WeightInKg;
        WeightInKg = 0.45359237 * WeightInPound;
                System.out.println("Weight in Kilogram ="+WeightInKg);
    }
}
