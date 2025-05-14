package com.example;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 4 numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        System.out.print("Enter fourth number: ");
        double num4 = scanner.nextDouble();

        // Calculations
        double sum = num1 + num2 + num3 + num4;
        double average = sum / 4;
        double product = num1 * num2 * num3 * num4;

        // Output
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);

        scanner.close();
    }
}


