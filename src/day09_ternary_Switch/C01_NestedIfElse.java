package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        //girdiğiniz 4 basamaklı sayı 5 e bölunsün son rakamı 0 olsun ve cift sayı yazdırılsın.
        //son rakamı 0 degil ise 5 e bölünen tek sayı yazzdıeın
        // e bölünmuyorsa ekrana tekrar deneyin yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir sayı giriniz");
        int sayi= scan.nextInt();
        if (sayi<1000 || sayi>9999){  //istenmeyen durmu yazıyoruz
            System.out.println("Lutfen 4 basamaklı bir sayi giriniz");

        }else if (sayi%5==0) {  // 4 basamaklı ve sayı 5 e tam bölünüyor
            if (sayi % 10 == 0) {    // 4 basamaklı 5 ile bölünebilen ve son rakamı 0 olan//
            }else {
                System.out.println("5'e bölünen çift sayi");
            }

        }else {
            System.out.println("tekrar deneyin");
        }

        
    }
}
