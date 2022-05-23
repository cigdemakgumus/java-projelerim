package day10_switchStringManipilation;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // 4 işlem yapan bir hesap makinesi kodlayın
        // kullanıcı işlemi sembolü ile seçsin. iki sayı girsin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Yapacağınız 4 işlemi * + / - olarak seçin");
        char islem =scan.next().charAt(0);

        System.out.println("1. sayı :");
        double sayi1=scan.nextDouble();
        System.out.println("2. sayı :");
        double sayi2=scan.nextDouble();

        hesapMakinesi(islem,sayi1,sayi2);

    }

    private static void hesapMakinesi(char islem, double sayi1, double sayi2) {

        switch (islem){

            case '+' :
                System.out.print(sayi1 + "+" + sayi2 + "=" +(sayi1+sayi2));
                break;
            case '-' :
                System.out.print(sayi1 +"-"+ sayi2 + "=" +(sayi1-sayi2));
                break;
            case '*' :
                System.out.print(sayi1 +"*"+ sayi2 + "=" +(sayi1*sayi2));
                break;
            case '/' :
                System.out.print(sayi1+"/"+ sayi2 + "=" +(sayi1/sayi2));
                break;

            default:
                System.out.println("Hatalı işlem girdiniz");


        }
    }
}
