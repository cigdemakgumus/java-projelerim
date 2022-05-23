package day06_concatenation_Operators;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //Kullanıcıdan bir kelime isteyin eğer 3 veya daha fazla harften olusuyorsa son 2 harfini 3 kere yan yana yazdırın
        //DEĞİL İSE KELİMEYİ YAZDIRIN

        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen bir kelime girin");
        String str1= scan.next();

        if (str1.length()>=3){
            System.out.print(str1.substring(str1.length() - 2) + str1.substring(str1.length() - 2) + str1.substring(str1.length() - 2));
        }
    }
}
