package seminar4.task;

import java.util.*;

public class TaskOne {
    public static void reverseList() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random random = new Random();
        int length;
        System.out.println("Enter length list: ");
        length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(1, 20));
        }
        System.out.println("List before reversing: " + list);
        Collections.reverse(list);
        System.out.println("List after reversing: " + list);
    }
}
