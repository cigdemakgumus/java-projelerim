package day09_ternary_Switch;

import java.util.Scanner;

public class C06_Practic {
    public static void main(String[] args) {
        // verilen sayinin poztif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif sayi ise tek veya cift
        // negatif sayi ise -100'den buyuk veya kucuk
        // oldugunu belirleyen bir ternary yaziniz


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayı gırınız");
        int sayi= scan.nextInt();
        String sonuc= sayi>=0 ?
                (sayi%2==0 ? "Girdiğiniz sayi pozitif çift sayıdır" : "Girdiğiniz sayi pozitif tek sayıdır" ) :
                (sayi<-100 ? "Girdiğiniz sayi -100 den küçüktür" : "Girdiğiniz sayi -100 den büyüktür");
        System.out.println(sonuc);






    }
}
