package seminar3.task;

import java.util.*;

public class TaskThree{
    //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
    public static void math(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array");
        int length = scanner.nextInt();
        Random random = new Random();
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            array.add(random.nextInt(1, 20));
        }
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println(arithmetic(array));
    }

    private static String arithmetic(List<Integer> array){
        int min = ((Integer) array.get(0));
        int max = 0;
        int middle = 0;
        for (Integer item : array) {
            middle += item;
            if(min > item){
                min = item;
            }
            if(max < item){
                max = item;
            }
        }
        middle = middle / array.size();
        return "Min: " + min + " Max: " + max + " Middle: " + middle;
    }
}