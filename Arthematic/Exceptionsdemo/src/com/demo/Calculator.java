package com.demo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st No: ");
        double num1 = input.nextDouble();

        System.out.println("Enter 2st No: ");
        double num2 = input.nextDouble();

        System.out.println("Enter operator(+,-,*,/):");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }
        System.out.println(num1+""+operator+""+num2+"="+result);
        System.out.println("\nCalculator Table:\n");
        System.out.println("Num1 | Num2 | Operator | Result");
        System.out.println("-----|-----|---------|-------");
        System.out.println(num1 + " | " + num2 + " | " + operator + " | " + result);

    }
}
