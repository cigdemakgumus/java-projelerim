package day09_ternary_Switch;

import java.util.Scanner;

public class C08_practic {
    public static void main(String[] args) {
        //girdiğiniz 4 basamaklı sayı 5 e bölunsün son rakamı 0 olsun ve cift sayı yazdırılsın.
        //son rakamı 0 degil ise 5 e bölünen tek sayı yazzdıeın
        // e bölünmuyorsa ekrana tekrar deneyin yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir sayı giriniz");
        int sayi= scan.nextInt();

        if (sayi>=1000 && sayi<=9999){

            if(sayi%2==0 && sayi%5==0 && sayi/10==0){
                System.out.println("çift sayi yazdırılsın");
            }else if (sayi/10!=0){
                System.out.println("tek sayi");
            }

        }else{
            System.out.println("Tekrar deneyin");
        }

    }
}
