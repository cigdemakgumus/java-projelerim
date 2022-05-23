package day06_concatenation_Operators;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Scanner kullanarak 2 yrı değer giriniz bu iki kelimeyi birleştiriniz
        // ilk ve ikinci değişkenlerin ilk harflerini atıp birleştirin

        Scanner scan= new Scanner(System.in);
        System.out.print("String 1 : ");
        String str1= scan.nextLine();
        System.out.print("String 2 ");
        String str2=scan.nextLine();

        System.out.println(str1 + " "+str2);
        System.out.println(str1.concat(" "+str2));

        String ilkHarfsiz=str1.substring(1);
        String ilkHarfsiz2=str2.substring(1);
        System.out.println(ilkHarfsiz+ilkHarfsiz2);


    }
}
