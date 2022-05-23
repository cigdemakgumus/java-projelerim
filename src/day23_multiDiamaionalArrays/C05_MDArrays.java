package day23_multiDiamaionalArrays;

import java.util.Arrays;

public class C05_MDArrays {
    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir method olusturun
        int arr[]= {3,5,7};
        // arr[3]=8;  array'de olmayan bir index'e atama yapamayiz
        // arr={1,3,5}; // var olan bir array'e ayni boyutta bile olsa direk yeni degerler iceren bir array atayamayiz

        arr=new int[4];
        System.out.println(Arrays.toString(arr));
        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println();
        arrYeni[0]=1;
        arrYeni[2]=3;
        System.out.println(Arrays.toString(arrYeni));
    }
}
