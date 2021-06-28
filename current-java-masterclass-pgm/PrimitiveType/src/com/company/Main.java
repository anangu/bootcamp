package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        short shortValue = 10;
        byte  byteValue = 20;
        int intValue = 40;
        long longValue = 10000L + 20L * (shortValue + byteValue + intValue);
        System.out.println (longValue);
        short shortTotal = (short) (1000 * 10 * (shortValue + byteValue + intValue));
        System.out. println (shortTotal);
    }
}
