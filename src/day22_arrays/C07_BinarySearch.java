package day22_arrays;

import java.util.Arrays;

public class C07_BinarySearch {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor";
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        String harfler[]=str.split(",");
        System.out.println(Arrays.toString(harfler));
        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));

    }



}
