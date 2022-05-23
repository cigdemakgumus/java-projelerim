package day23_multiDiamaionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C4_MDArrays {
    public static void main(String[] args) {
        // kullaniciya kac elementlik bir array olusturacagini sorun
        // array'i olusturup elementleri kullanicidan alip, array'e atayin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kaç elementlik array istediğinizi yazın");
        int uzunluk= scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array için :" + (i+1) +". elementi giriniz");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));


    }
}
