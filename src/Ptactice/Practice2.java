package Ptactice;

import java.util.Arrays;

public class Practice2 {

    public static void main(String[] args) {
        //HeySiri dizisini ByeSiri ye cevirin

        String str="HeySiri";
        str=str.replace("Hey","Bye");

        String [] arr=new String[1];
        arr[0]=str;

        System.out.println(Arrays.toString(arr));

        //Aşağıdaki arrayda toplamları 9 olan sayı cıflerini yazdıran bir method yazınız

        int arr2[]={5,7,-6,4,2,15,3,8,1};
        int istenentoplam=9;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr2[i] + arr2[j] == istenentoplam) {
                    System.out.println("Sayılar : "+arr2[i]+"+"+arr2[j]+"="+istenentoplam);
                }



            }

        }


    }
}
