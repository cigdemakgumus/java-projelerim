package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {

            // verilen bir arrayi buyukten kucuge siralayip bize donduren method olusturun
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        arr= terstenSirala(arr);
        System.out.println("En buyuk Element : " + arr[0]);
    }

    private static int[] terstenSirala(int[] arr) {

        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];
        for (int i = 0; i <tersArr.length ; i++) {
            tersArr[i]=arr[arr.length-1-i];

        }
        return tersArr;
    }

}
