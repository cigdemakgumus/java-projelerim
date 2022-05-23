package day17_forLoop;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        
        //Kullanıcıdan toplamak icin sayı isteyin ve toplam 500 e ulasıncaya kadar devam etmesini isteyin. 
        // Toplam 500 e ulastığında veya gectiğinde toplamı ve kac sayı girildiğini yazdırın.
       
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayac=0;

       do {
           System.out.println("Lutfen bir sayı giriniz");
           sayi= scan.nextInt();
           toplam+=sayi;
           sayac++;
       }while (toplam<=500);
        System.out.println(toplam);
        System.out.println(sayac);
    }
}
