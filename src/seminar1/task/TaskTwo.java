package seminar1.task;

import java.util.Scanner;

//n! (произведение чисел от 1 до n)
public class TaskTwo {
    public static void Factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Answer: " + GetNum(number));
        scanner.close();
    }

    static int GetNum(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}