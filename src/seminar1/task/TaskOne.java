package seminar1.task;

import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
public class TaskOne {

    // Циклом
    public static void triangularNumberV1() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"n\" number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        System.out.println(result);
        scanner.close();
    }

    // Формулой
    public static void triangularNumberV2() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"n\" number: ");
        int n = scanner.nextInt();
        result = n * (n + 1) / 2;
        System.out.println(result);
        scanner.close();
    }

    // До N и в обратном порядке
    public static void triangularNumberV3() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"n\" number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result + i;
            if (i == n) {
                for (int j = i - 1; 0 < j; j--) {
                    result = result + j;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}