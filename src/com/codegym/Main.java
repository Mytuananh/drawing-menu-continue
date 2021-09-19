package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(" ");
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}
