package day19_whileForLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //  ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //  yanlislikla kac negative sayi girdigini
        //  ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int negatifSayiToplami=0;
        int pozitifSayiToplami=0;

        do {
            System.out.println("Lutfen tam sayı giriniz. İşlem bittiğinde 0 'a basınız");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("Negatif sayı giremezsiniz");
                negatifSayiToplami++;

            }else if (sayi>0){
                System.out.println(sayi);
                toplam+=sayi;
                pozitifSayiToplami++;
            }
        }while (sayi!=0);
        System.out.println("Toplam "+ pozitifSayiToplami +" adet pozitif tam sayı girdiniz");
        System.out.println("Toplam "+ negatifSayiToplami +" adet negatif tam sayı girdiniz");
        System.out.println("Girdiğiniz pozitif tam sayıların toplamı "+toplam);

    }
}
