package okulProje;

import java.util.Scanner;

public class Depo {


    static void anaMenu(){
        Scanner scan=new Scanner(System.in);
        String tercih="";
       do {
        System.out.println("********** YILDIZ KOLEJİNE HOŞGELDİNİZ *********");
        System.out.println("Lutfen gitmek istediğiniz menüyü secin");
        System.out.println("Okul bilgisi:    1\nÖğretmen Menü:    2\nÖğrenci Menü:  3\nÇıkış    :Q");

        tercih=scan.nextLine();

        switch (tercih){
            case "1":
                Depo.okulBilgisiYazdir();
                break;
            case "2":
                break;
            case "3":
                break;
            case "Q":
                break;
            default:
                System.out.println("Lutfen gecerli bir menu giriniz");

        }



       } while (!tercih.equalsIgnoreCase("Q"));

       Depo.projeDurdur();

    }

    private static void okulBilgisiYazdir() {
    Okul Veriable=new Okul();

    }

    private static void projeDurdur() {
        System.out.println("Okul projesinden cıktınız");
    }


}
