package edu.step.comparator;

import edu.step.calculator.Calculator;

import java.util.Scanner;

public class ComparatorExecutor {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        NumbersComparator nc = new NumbersComparator();

        System.out.print("Enter values: ");
        String expression = scanner.nextLine();
        String[] values = expression.split(" ");

        System.out.print("Do you want the min of max value? (min/max): ");
        String caseType = scanner.next().toLowerCase();

        int a, b;

        if (caseType.equals("min")) {
            for(int i=0; i<values.length-1; i++) {
                a = Integer.parseInt(values[i]);
                b = Integer.parseInt(values[i+1]);
                values[i+1] = String.valueOf(nc.minNumber(a, b));
            }
        } else if (caseType.equals("max")) {
            for(int i=0; i<values.length-1; i++) {
                a = Integer.parseInt(values[i]);
                b = Integer.parseInt(values[i+1]);
                values[i+1] = String.valueOf(nc.maxNumber(a, b));
            }
        } else {
            System.out.println("Error");
            return;
        }

        String answer = values[values.length-1];

        System.out.print("The " + caseType + " value of the array given above is: " + answer);
    }
}
