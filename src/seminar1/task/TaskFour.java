package seminar1.task;

import java.util.Scanner;

public class TaskFour {
    public static Scanner scanner = new Scanner(System.in);

    public static void Calculator() {
        System.out.println("Simple calculator");
        int firstNumber = getInt();
        String operation = getOperation();
        int secondNumber = getInt();
        System.out.println("Answer: " + Math(firstNumber, secondNumber, operation));
        scanner.close();
    }

    public static int getInt() {
        System.out.println("Enter number: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Incorrect number entered, please try again!");
            scanner.next();
            number = getInt();
        }
        return number;
    }

    public static String getOperation() {
        System.out.println("Enter an operation (+, -, /, *): ");
        String operation;
        if (scanner.hasNext()) {
            operation = scanner.next();
        } else {
            System.out.println("Incorrect operation entered, please try again!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int Math(int first, int second, String operation) {
        int answer = 0;
        switch (operation) {
            case "+":
                answer = first + second;
                break;
            case "-":
                answer = first - second;
                break;
            case "/":
                answer = first / second;
                break;
            case "*":
                answer = first * second;
                break;
            default:
                System.out.println("Incorrect operation entered, please try again!");
                answer = Math(first, second, getOperation());
                break;
        }
        return answer;
    }
}