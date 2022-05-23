package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sınav {
    public static void main(String[] args) {

/* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
 *
 * */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen saçtiğiniz ürünü giriniz");
        System.out.println("Ürün Listesi :\nDomates   1 \nüzüm  2\nsalatalık  3\ncilek  4\npatates  5\n");
        int urun=scan.nextInt();
        System.out.println("Kaç kg istediğinizi giriniz");
        double kackg=scan.nextDouble();
        System.out.println("Baska ürün almak istiyor musunuz? Cevabınız evetse 'E' , Hayırsa 'H' yazınız ");
        char secim=scan.next().charAt(0);


        List<String> urunListesi=new ArrayList<>();
        List<Double>fiyatListesi=new ArrayList<>();

        double toplamFiyat=0;

            urunListesi.add("domat - urun kodu : 1 ");
            urunListesi.add("üzüm - urun kodu : 2 ");
            urunListesi.add("salatalık - urun kodu : 3 ");
            urunListesi.add("cilek - urun kodu : 4 ");
            urunListesi.add("patates - urun kodu : 5 ");

            fiyatListesi.add(15.0);
            fiyatListesi.add(12.0);
            fiyatListesi.add(10.0);
            fiyatListesi.add(25.0);
            fiyatListesi.add(32.0);


    double toplam=0;

        if (secim=='H'){
            toplam=toplamFiyat*kackg;

            System.out.println("Toplam Tutar : "+ toplam +" TL");
        }else {
            System.out.println("Lütfen saçtiğiniz ürünü giriniz");
            System.out.println("Domates   1 \nüzüm  2\nsalatalık  3\ncilek  4\npatates  5\n");

        }

    }
}
