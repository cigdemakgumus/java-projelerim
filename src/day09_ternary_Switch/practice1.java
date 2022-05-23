package day09_ternary_Switch;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        //Kullanıcıdan pozitif tam sayi girmesini isteyin. Bu sayi 3 basamaklı ise "3 Basamaklı sayı" yazdırın.
        //3 basamaklı değil ise çift olup olmadığını kontrol edin. Çift ise 3 basamklı olmayan çift sayı yazdırın
        //değilse 3 basamaklı olmayan tek sayı yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi < 0) {
            System.out.println("Lütfen pozitif bir saytı giriniz");

        } else if (sayi >= 100 && sayi < 1000) {
            System.out.println("Sayı 3 Basamaklıdır");

        } else {
            if (sayi % 2 == 0) {
                System.out.println("sayı 3 basamaklı olmayan çift sayidır");
            } else {
                System.out.println("Sayı 3 basamklı olmayan tek sayıdır");
            }
        }

    }
}
