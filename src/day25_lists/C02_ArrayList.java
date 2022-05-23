package day25_lists;

import java.util.Arrays;

public class C02_ArrayList {
    public static void main(String[] args) {

        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenElement=3;

        istenmeyenEleman(arr,istenmeyenElement);










    }

    private static void istenmeyenEleman(int[] arr, int istenmeyenElement) {
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenmeyenElement){
                sayac++;

            }

        }
        int yeniArr[]=new int[arr.length-sayac];
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyenElement){
                yeniArr[toplam]=arr[i];
                toplam++;
            }

        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
