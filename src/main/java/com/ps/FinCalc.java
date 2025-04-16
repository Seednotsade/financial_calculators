package com.ps;

import java.util.Scanner;

public class FinCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a calculator:");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Future Value Calculator");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\nSimple Mortgage Calculator");

            System.out.print("Enter principal: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double rate = scanner.nextDouble() / 100;

            System.out.print("Enter loan term (years): ");
            int years = scanner.nextInt();

            int months = years * 12;
            double monthlyRate = rate / 12;
            double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
            double totalInterest = (monthlyPayment * months) - principal;

            System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
            System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);

        } else if (choice == 2) {
            System.out.println("\nFuture Value Calculator");

            System.out.print("Enter deposit amount: ");
            double deposit = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double rate = scanner.nextDouble() / 100;

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            double futureValue = deposit * Math.pow(1 + (rate / 365), 365 * years);
            double totalInterest = futureValue - deposit;

            System.out.printf("Future Value: $%.2f\n", futureValue);
            System.out.printf("Total Interest Earned: $%.2f\n", totalInterest);
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}
