package day21_arrays;

import java.util.Arrays;

public class C03_Array {
    public static void main(String[] args) {

        String arr1[]={"Ali","Veli","Ayşe"};
        System.out.println(arr1[0]);
        arr1[1]="Esila";
        System.out.println(arr1[1]);
        System.out.println(Arrays.toString(arr1));
        int arr2[]=new int[4];
        System.out.println(arr2[2]);
        arr1[2]="esra";
        System.out.println(arr1[2]);
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i <4 ; i++) {
            System.out.println(arr1);

        }
        int arr3[]=new int[6];
        for (int i = 0; i <arr3.length; i++) {
            arr3[i]+=i;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3[arr3.length-1]);
    }
}
