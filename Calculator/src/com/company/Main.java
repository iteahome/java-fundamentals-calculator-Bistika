package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the numbers you want to perform operations upon:_");
        double x = Scan.nextDouble();
        double y = Scan.nextDouble();
        System.out.print("Enter the operator (+, -, *, /, %):_");
        char operator = Scan.next().charAt(0);
        double z = 0;
        switch(operator)
        {
            case '+':
                z = x + y;
                break;
            case '-':
                z = x - y;
                break;
            case '*':
                z = x * y;
                break;
            case '/':
                z = x / y;
                break;
            case '%':
                z = x % y;
                break;
        }
        System.out.println("The result is " + z );
    }
}