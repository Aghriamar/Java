package seminar4.task;

import java.util.*;

public class TaskTwo {

    private static Scanner scanner = new Scanner(System.in);
    public static LinkedList<Integer> createList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random random = new Random();
        int length;
        System.out.println("Enter length list: ");
        length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(1, 20));
        }
        System.out.println("Random list: " + list);
        return list;
    }
    public static void enqueue(LinkedList<Integer> list) {
        Queue<Integer> queue = list;
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        queue.add(number);
        System.out.println("Add an element to the end: " + queue);
    }

    public static void dequeue(LinkedList<Integer> list) {
        Queue<Integer> queue = list;
        System.out.println("Remove first element: " + queue.poll());
        System.out.println("List: " + queue);
    }

    public static void first(LinkedList<Integer> list) {
        Queue<Integer> queue = list;
        System.out.println("Get first element: " + queue.peek());
        System.out.println("List: " + queue);
    }
}
