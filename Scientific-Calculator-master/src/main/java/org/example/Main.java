package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Start of Execution");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System. out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = performOperation(choice, num1, num2);

            System.out.println("Result: " + result);
        }

        logger.info("End of Execution");
    }

    public static double performOperation(int choice, double num1, double num2) {
        double result = 0.0;

        switch (choice) {
            case 1:
                logger.info("Start op: Addition"); // Log the start of the addition operation
                result = num1 + num2;
                logger.info("End op: Addition"); // Log the end of the addition operation
                break;
            case 2:
                logger.info("Start op: Subtraction"); // Log the start of the subtraction operation
                result = num1 - num2;
                logger.info("End op: Subtraction"); // Log the end of the subtraction operation
                break;
            case 3:
                logger.info("Start op: Multiplication"); // Log the start of the multiplication operation
                result = num1 * num2;
                logger.info("End op: Multiplication"); // Log the end of the multiplication operation
                break;
            case 4:
                logger.info("Start op: Division"); // Log the start of the division operation
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    logger.warn("Invalid input");
                    System.out.println("Error: Division by zero!");
                }
                logger.info("End op: Division"); // Log the end of the division operation
                break;
            default:
                logger.warn("Invalid input");
                System.out.println("Invalid choice!");
        }

        return result;
    }
}
