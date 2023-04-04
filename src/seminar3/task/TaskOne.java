package seminar3.task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne{
    //Реализовать алгоритм сортировки слиянием
    public static void mergeSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array");
        int length = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1, 20);
        }
        System.out.println("Sorted array: " + Arrays.toString(sorting(array)));
    }

    private static int[] sorting(int[] array) {
        int[] buffer1 = Arrays.copyOf(array, array.length);
        int[] buffer2 = new int[array.length];
        int[] result = sortingInner(buffer1, buffer2, 0, array.length);
        return result;
    }

    private static int[] sortingInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if(startIndex >= endIndex - 1){
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = sortingInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = sortingInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex){
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle){
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex){
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}