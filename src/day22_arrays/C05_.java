package day22_arrays;

import java.util.Arrays;

public class C05_ {
    public static void main(String[] args) {

        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        buyuktenKucugeSirala(arr);
    }

    private static void buyuktenKucugeSirala(int[] arr) {
        Arrays.sort(arr);
        int tersSirala[]=new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            tersSirala[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersSirala));

    }
}
