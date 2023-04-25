package edu.step.converter.dynamic;

import java.util.Scanner;
import edu.step.converter.TempConverter;

public class DynamicConverter {
    public static void execute() {
        TempConverter tc = new TempConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter temperature unit of measure (C/F): ");
        String unit = scanner.next().toUpperCase();

        double convertedTemperature = 0;
        String convertedUnit = "";

        if (unit.equals("C")) {
            convertedTemperature = tc.celsiusToFahrenheit(temperature);
            convertedUnit = "F";
        } else if (unit.equals("F")) {
            convertedTemperature = tc.fahrenheitToCelsius(temperature);
            convertedUnit = "C";
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println(temperature + "°" + unit + " = " + convertedTemperature + "°" + convertedUnit);
    }
}
