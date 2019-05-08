package lab3;

import lab4.Quick;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mergeKN {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;

        while (i < result.length) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
            i++;
        }
        return result;
    }

    public static List<String> mergeStr(String ... a) {
        List<String> res = new ArrayList<>();
        for (int i=0; i<a.length; i++){
            res.add(a[i]);
        }
        Collections.sort(res);
        return res;

    }
    public static int[] mergeDouble(int[] ... a) {
        int[] rez = new int[a.length*a[0].length];
        int i =0;
            for(int j =0; j< a[0].length; j++) {
                for (int k=0;k<a.length;k++)
                {
                    rez[i] = a[k][j];
                    i++;
                }
            }

        Arrays.sort(rez);
        return rez;


}

    public static void main(String[] args) {
        int[] a = { 6, 7, 8};
        int[] b = { 1, 2, 3};
        int[] c = { 0, 3, 9};

        int[] rezult = merge(merge(a, b),c);
        int[] rez = mergeDouble(a,b,c);
        int[] idx = {0, 2, 1};

        String str2="АAPOH";
        String str3="аарон";
        String str4="ААрон";
        String str5="аАрон";
        String str6="Берта";
        String str7="берта";
        List<String> res = mergeStr(str2,str3,str4,str5,str6, str7);
        for (String out: res
             ) {
            System.out.println(out);
        }
        System.out.println(Arrays.toString(rezult));
        System.out.println(Arrays.toString((rez)));
    }
}
