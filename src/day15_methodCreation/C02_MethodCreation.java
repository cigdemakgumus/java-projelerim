package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime yazınız");
        String kelime= scan.next();
        int harfSayisi=kelime.length();
        String tersKelime="";

        if (harfSayisi<3){
            System.out.println("kelime cok kisa");

        }else if (harfSayisi<=5){

            if (harfSayisi==3){

                tersKelime=kelime.substring(2,3).toUpperCase()+kelime.substring(1,2)+ kelime.substring(0,1);
            }else if (harfSayisi==4){
                tersKelime=kelime.substring(3,4).toUpperCase()+kelime.substring(2,3)+ kelime.substring(1,2)+kelime.substring(0,1);

            }else {
                tersKelime = kelime.substring(4, 5).toUpperCase() + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
            }
            System.out.println("Harf Sayisi :" + harfSayisi);
            System.out.println("girdiğiniz sayinin tersten okunusu :"+ tersKelime);
        }else {

            System.out.println("kelime cok uzun");

        }


    }
}
