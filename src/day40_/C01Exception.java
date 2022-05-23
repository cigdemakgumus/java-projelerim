package day40_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {

        //Kullnıcıdan sayı alın toplam 500 ü gecerse programı bitirin. Kullanıcı bitirmek istediğnde q ya basmalıdır.

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            int sayi = 0;
            System.out.println("Lütfen toplamak için bir sayı girin. Bitirmek için q ya basın");
            try {
                sayi = scan.nextInt();
                toplam += sayi;
            } catch (InputMismatchException e) {
                String hataliGiris = scan.next();

                if (hataliGiris.equalsIgnoreCase("q")) {


                } else System.out.println("Hatalı giriş");
            }

        } while (toplam < 500);
        System.out.println("Girdiğiniz sayının toplamı : " + toplam);
    }
}
