package lab4;

import java.util.Random;

public class lab4 {
    public static int[] getRandomArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = new Random().nextInt(100000);
        }
        return arr;
    }


    public static void main(String[] args) {
        long start = System.nanoTime();
        RadixSort.radixsort(getRandomArr(1000000));
        long finish = System.nanoTime();
        System.out.println(((finish - start) / 1000000000.0) + " sec");

        start = System.nanoTime();
        Bubble.bubbleSort(getRandomArr(100000));
        finish = System.nanoTime();
        System.out.println(((finish - start) / 1000000000.0) + " sec");

        start = System.nanoTime();
        Quick.quicksort(getRandomArr(1000000), 1, 100000);
        finish = System.nanoTime();
        System.out.println(((finish - start) / 1000000000.0) + " sec");


    }
}
