package com.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln x)");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit the program");
            System.out.print("Choose an option -: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number:  ");
                    double num1 = scanner.nextDouble();
                    System.out.println("√" + num1 + " = " + calculator.squareRoot(num1));
                    break;

                case 2:
                    System.out.print("Enter an integer: ");
                    int num2 = scanner.nextInt();
                    System.out.println(num2 + "! = " + calculator.factorial(num2));
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("ln(" + num3 + ") = " + calculator.naturalLog(num3));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + calculator.power(base, exponent));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
