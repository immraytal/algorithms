package lab4;

public class Bubble {
    public static void bubbleSort(int[] numbers) {

        int n = numbers.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
            if (i%10000 == 0)
                System.out.println(" i = " + i);
        }
    }
}
