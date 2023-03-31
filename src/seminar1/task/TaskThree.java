package seminar1.task;

//Вывести все простые числа от 1 до 1000
public class TaskThree {
    public static void SimpleNumber() {
        System.out.println("Simple number from 1 to 1000");
        for (int i = 2; i < 1000; i++) {
            Boolean isprime = true;
            for (int j = 2; j <= i / j; j++) {
                if ((i % j) == 0)
                    isprime = false;
            }
            if (isprime)
                System.out.println("Prime number: " + i);
        }
    }
}