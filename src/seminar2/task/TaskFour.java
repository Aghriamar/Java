package seminar2.task;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskFour {
    public static Scanner scanner = new Scanner(System.in);
    private static final Logger LOG = Log.log(TaskFour.class.getName());

    public static void calculator() {
        System.out.println("Simple calculator");
        int firstNumber = getInt();
        String operation = getOperation();
        int secondNumber = getInt();
        System.out.println("Answer: " + math(firstNumber, secondNumber, operation));
        scanner.close();
    }

    public static int getInt() {
        System.out.println("Enter number: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Incorrect number entered, please try again!");
            LOG.log(Level.WARNING, "Неверный ввод.");
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
            LOG.log(Level.WARNING, "Неверный ввод операции.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int math(int first, int second, String operation) {
        int answer;
        switch (operation) {
            case "+" -> answer = first + second;
            case "-" -> answer = first - second;
            case "/" -> answer = first / second;
            case "*" -> answer = first * second;
            default -> {
                System.out.println("Incorrect operation entered, please try again!");
                LOG.log(Level.WARNING, "Неверная операция.");
                answer = math(first, second, getOperation());
            }
        }
        return answer;
    }
}