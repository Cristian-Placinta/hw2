package edu.step.calculator;

import java.util.Scanner;

public class CalculatorExecutor {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        Calculator maths = new Calculator();

        System.out.print("Enter mathematical expression (2 values): ");
        String expression = scanner.nextLine();

        String[] components;
        String operator;

        if(expression.contains("+")) {
            components = expression.split("\\+");
            operator = "+";
        } else if(expression.contains("-")) {
            components = expression.split("\\-");
            operator = "-";
        } else if(expression.contains("*")) {
            components = expression.split("\\*");
            operator = "*";
        } else if(expression.contains("/")) {
            components = expression.split("\\/");
            operator = "/";
        } else {
            System.out.println("Invalid operator");
            return;
        }

        if(components.length != 2) {
            System.out.println("Invalid nr of values");
            return;
        }

        components[0] = components[0].replaceAll("\\s+", "");
        components[1] = components[1].replaceAll("\\s+", "");

        double a = Double.parseDouble(components[0]);
        double b = Double.parseDouble(components[1]);

        double answer = 0;

        switch (operator) {
            case "+":
                answer = maths.addition(a, b);
                break;
            case "-":
                answer = maths.subtraction(a, b);
                break;
            case "*":
                answer = maths.multiplication(a, b);
                break;
            case "/":
                answer = maths.division(a, b);
                break;
            default:

        }

        System.out.print("Answer: " + answer);
    }
}
