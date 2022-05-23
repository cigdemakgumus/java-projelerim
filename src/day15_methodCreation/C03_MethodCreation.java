package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime yazınız");
        String kelime = scan.next();
        int harfSayisi = kelime.length();


        if (harfSayisi < 3) {
            System.out.println("kelime cok kisa");

        } else if (harfSayisi == 3) {
            ucHarfiTersYazdir(kelime);

        } else if (harfSayisi == 4) {
            dortHarfiTersYazdir(kelime);

        } else if (harfSayisi == 5) {
            besHarfiTersYazdir(kelime);

        }else {
            System.out.println("kelime cok uzun");

    }

    }

    public static void besHarfiTersYazdir(String kelime) {
        String tersKelime=kelime.substring(4).toUpperCase()+kelime.substring(3,4) +kelime.substring(2,3) + kelime.substring(1,2)+ kelime.substring(0,1);
        System.out.println("girdiğiniz kelimenin tersten okunusu : " + tersKelime);
        System.out.println("girdiginiz kelimenin harf sayisi : 5");
    }

    public static void ucHarfiTersYazdir(String kelime) {
        String tersKelime=kelime.substring(2).toUpperCase()+ kelime.substring(1,2)+ kelime.substring(0,1);
        System.out.println("girdiğiniz kelimenin tersten okunusu : " + tersKelime);
        System.out.println("girdiginiz kelimenin harf sayisi : 3");
    }

    public static void dortHarfiTersYazdir(String kelime) {
        String tersKelime=kelime.substring(3).toUpperCase()+kelime.substring(2,3) + kelime.substring(1,2)+ kelime.substring(0,1);
        System.out.println("girdiğiniz kelimenin tersten okunusu : " + tersKelime);
        System.out.println("girdiginiz kelimenin harf sayisi : 4");
    }


}

