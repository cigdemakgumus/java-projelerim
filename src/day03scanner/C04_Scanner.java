package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String kullaniciIsmi=scan.next();
        System.out.println("Kullanicinin girdigi isim :" + kullaniciIsmi);
    }
}
