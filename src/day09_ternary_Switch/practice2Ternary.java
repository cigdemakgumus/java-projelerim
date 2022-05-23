package day09_ternary_Switch;

import java.util.Scanner;

public class practice2Ternary {
    public static void main(String[] args) {

        //Kullanıcıdan pozitif tam sayi girmesini isteyin. Bu sayi 3 basamaklı ise "3 Basamaklı sayı" yazdırın.
        //3 basamaklı değil ise çift olup olmadığını kontrol edin. Çift ise 3 basamklı olmayan çift sayı yazdırın
        //değilse 3 basamaklı olmayan tek sayı yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayı giriniz");
        int sayi = scan.nextInt();

        String sonuc= (sayi>99 && sayi<1000) ? ("Sayı 3 Basamaklıdır") : (sayi%2==0) ?
        ("Sayı 3 Basamaklı olmayan çift"):("Sayı 3 Basamaklı olmayan tek sayıdır");
        System.out.println(sonuc);

    }
}
