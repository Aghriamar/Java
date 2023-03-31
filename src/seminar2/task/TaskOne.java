package seminar2.task;

import java.sql.DataTruncation;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskOne {
    private static Scanner scanner = new Scanner(System.in);
    private static final Logger LOG = Log.log(TaskOne.class.getName());
    private static int[] crateRandomArray(int length) {
        Random random = new Random();
        LOG.log(Level.INFO, "Create random array");
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1,20);
            LOG.log(Level.INFO, "Added number: " + array[i]);
        }
        LOG.log(Level.INFO, "Finish create random array: " + Arrays.toString(array));
        System.out.println("Random array: \n" + Arrays.toString(array));
        return array;
    }

    private static int[] sorting(int[] array) {
        LOG.log(Level.INFO, "Start sorting an array");
        for (int i = 0; i < array.length - 1; i++) {
            LOG.log(Level.INFO, "Cycle " + (i+1));
            for (int j = 0; j < array.length - i - 1; j++) {
                LOG.log(Level.INFO, "\nNow number: " + array[j] + "\nNext number: " + array[j + 1]);
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    LOG.log(Level.INFO, "The number " + array[j + 1] + " is greater than " + array[j] + ", rearrange");
                }
            }
            LOG.log(Level.INFO, "Now an array: " + Arrays.toString(array));
        }
        LOG.log(Level.INFO, "Finish sorting an array: " + Arrays.toString(array));
        return array;
    }

    public static void bubbleSort(){
        System.out.println("Enter length array: ");
        int length = scanner.nextInt();
        System.out.println("Sorted array: \n" + Arrays.toString(sorting(crateRandomArray(length))));
    }
}
