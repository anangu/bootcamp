package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double doubleVar1 = 20d , doubleVar2 = 80d;
        int intVar = (int)((doubleVar1 + doubleVar2) * 100) % 40 ;
        boolean booleanVar = (intVar == 0) ? true : false;
        System.out.println("BooleanVar Value is "+booleanVar);
        if (!booleanVar)
        {
            System.out.println("Got some remainder");
        }

    }
}
