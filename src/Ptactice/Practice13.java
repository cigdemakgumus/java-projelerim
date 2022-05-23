package Ptactice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice13 {

        static List<String>urunListesi=new ArrayList<>();
        static List<Double>fiyatListesi=new ArrayList<>();
        static Scanner scan=new Scanner(System.in);
        static double toplamFiyat=0;
    public static void main(String[] args) {
        urunListesi.add("domat - urun kodu : 1 ");
        urunListesi.add("sogan - urun kodu : 2 ");
        urunListesi.add("erik - urun kodu : 3 ");
        urunListesi.add("cilek - urun kodu : 4 ");
        urunListesi.add("limon - urun kodu : 5 ");

        fiyatListesi.add(15.0);
        fiyatListesi.add(12.0);
        fiyatListesi.add(10.0);
        fiyatListesi.add(25.0);
        fiyatListesi.add(32.0);

        urunSec();

    }

    private static void urunSec() {
        System.out.println("Lutfen ürün secınız");
        int secim= scan.nextInt();
        System.out.println("Lutfen kac kg istediğinizi giriniz");
        Double kilo=scan.nextDouble();
        double urunTutari=kilo*fiyatListesi.get(secim-1);
        toplamFiyat+=urunTutari;


        urunHesapla();
    }

    private static void urunHesapla() {
        System.out.println("urun eklemek istiyorsanız 1,  işlemi sonlandırmak icin 2 yi secin");
        int urunEkle=scan.nextInt();
        if (urunEkle==1){
            urunSec();
        }else
            kasa();
    }




    private static void kasa() {
        System.out.println("isleminiz sona erdi");
        System.out.println("ödenecek toplam : " + toplamFiyat);
    }

}