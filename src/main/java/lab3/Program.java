package lab3;
import java.lang.reflect.Array;
import java.util.*;

public class Program
{
    private static int[] Rearrange(int[] A, int[] less, int n, int m)
    {
        int[] B = new int[n];
        int[] next = new int[m + 1];
        int key, index;
        for (int j = 0; j < less.length; j++)
        {
            next[j] = less[j] + 1;
        }
        System.out.println("\nNext: ");
        for (int i = 0; i < next.length; i++)
        {
            System.out.printf("%1$s ", next[i]);
        }
        for (int i = 0; i < B.length; i++)
        {
            key = A[i];
            index = next[key];
            B[index - 1] = A[i];
            next[key]++;
        }
        return B;
    }
    private static int[] CountKeysLess(int[] equal, int m)
    {
        int[] less = new int[equal.length];
        less[0] = 0;
        for (int j = 1; j < less.length; j++)
        {
            less[j] = less[j - 1] + equal[j - 1];
        }
        return less;
    }
    private static int[] CountKeysEqual(int[] A, int n, int m)
    {
        int[] equal = new int[m + 1];
        for (int i = 0; i < equal.length; i++) equal[i] = 0;
        int key;
        for (int i = 0; i < n; i++)
        {
            key = A[i];
            equal[key]++;
        }
        return equal;
    }
    public static void main(String[] args)
    {
        Random rand = new Random();
        System.out.println("Enter the number of elements:");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("enter the maximum possible value:");
        int m = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Your array:");
        int [] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = rand.nextInt(m);
            System.out.printf("%1$s ", array[i]);
        }
        IntSummaryStatistics stat = Arrays.stream(array).summaryStatistics();
        int[] equal = CountKeysEqual(array, array.length, stat.getMax());
        System.out.println("\nEqual: ");
        for (int i = 0; i < equal.length; i++)
        {
            System.out.printf("%1$s ", equal[i]);
        }
IntSummaryStatistics statNew = Arrays.stream(CountKeysEqual(array, array.length, stat.getMax())).summaryStatistics();
        int[] less = CountKeysLess(CountKeysEqual(array, array.length, stat.getMax()), statNew.getMax()); // несколько параметров доделать
        System.out.println("\nLess: ");
        for (int i = 0; i < less.length; i++)
        {
            System.out.printf("%1$s ", less[i]);
        }

        array = Rearrange(array, less, array.length, stat.getMax());
        System.out.println("\nRearrange: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%1$s ", array[i]);
        }
    }
}
