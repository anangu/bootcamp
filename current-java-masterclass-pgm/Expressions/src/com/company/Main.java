package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result;
        result = 1 + 2;
        System.out.println("1+2= " + result);
        int previousResult = result;
        System.out.println("PreviousResult = "+ previousResult);
        result = result - 1;
        System.out.println("3-1=" + result);
        result = result * 10 ; // 2 * 10 = 20
        System.out.println("2*10 ="+result);
        result = result / 5 ; //20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        result = result % 3 ; //4 % 3 = 1
        System.out.println("4 % 3 = " + result);
        result ++;
        System.out.println("1 + 1 = " + result);
        result --;
        System.out.println("2 - 1 = " + result);
        result += 2;
        System.out.println("1 + 2 = " + result);
        result -= 2;
        System.out.println("3 - 2 = " + result);
        result *= 10;
        System.out.println("1 * 10 = " + result);
        result /= 5;
        System.out.println("10 / 5 = " + result);
        result %= 2;
        System.out.println("2 % 2 = " + result);
        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("I`m not an Alien");
        }
        if (!isAlien)
        {
            System.out.println("I`m an Alien");
        }
       boolean iscar = true;
        boolean wascar = iscar ? true : false;
                if (wascar)
        {
            System.out.println("WasCar is True");
        }


    }
}
