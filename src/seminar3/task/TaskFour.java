package seminar3.task;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class TaskFour{
    //*Реализовать разность массивов и симметрическую разность.
    private static int length;
    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array");
        length = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1, 20);
        }
        System.out.println("Array: \n" + Arrays.toString(array));
        return array;
    }

    private static TreeSet<Integer> toTreeSet(int[] array){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            treeSet.add(array[i]);
        }
        return treeSet;
    }

    public static void difference(int[] array1, int[] array2){
        TreeSet<Integer> tSet1 = toTreeSet(array1);
        TreeSet<Integer> tSet2 = toTreeSet(array2);
        TreeSet<Integer> tSet3 = new TreeSet<Integer>();
        tSet3 = (TreeSet<Integer>) tSet1.clone();
        tSet1.removeAll(tSet2);
        tSet2.removeAll(tSet3);
        tSet1.addAll(tSet2);
        System.out.println("\nDifference array: " + Arrays.toString(tSet1.toArray()));
    }

    public static void intersection(int[] array1, int[] array2){
        TreeSet<Integer> tSet1 = toTreeSet(array1);
        TreeSet<Integer> tSet2 = toTreeSet(array2);
        tSet1.retainAll(tSet2);
        System.out.println("\nIntersection array: " + Arrays.toString(tSet1.toArray()));
    }

    public static void union(int[] array1, int[] array2){
        TreeSet<Integer> tSet1 = toTreeSet(array1);
        TreeSet<Integer> tSet2 = toTreeSet(array2);
        tSet1.addAll(tSet2);
        System.out.println("\nUnion array: " + Arrays.toString(tSet1.toArray()));
    }
}