package seminar3.task;

import java.util.*;

public class TaskTwo{
    //Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void removeItem() {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array");
        int length = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(1, 20));
        }
        System.out.println("Created random array: \n" + Arrays.toString(list.toArray()));
        System.out.println("Removed even number: \n" + Arrays.toString(removeEvenNumber(list).toArray()));
    }

    private static List<Integer> removeEvenNumber(List<Integer> list){
        var listIterator = list.iterator();
        while (listIterator.hasNext()){
            var item = listIterator.next();
            if(item.intValue() % 2 == 0){
                listIterator.remove();
            }
        }
        return list;
    }
}