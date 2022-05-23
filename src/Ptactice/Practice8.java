package Ptactice;

import java.util.Locale;
import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {


        //Bulunduğunuz yerden bir yere yolculuk edeceksiniz.Köln veya frankfurta gidebilirsiniz
        //Bilet fiyatı hesabı= Her 20 km basına 5 euro. örn(100 km yol Bilet parası (100/20)*5=25 euro
        //Frankfurt veya Köln olarak giriş yapın. Case frankfurtsa Girdiğiniz sehrin isimi buyuk harfe cevrilsin.
        // Frankfurt km hesabı işlemi yapın.konsolda frankfurt 15 euro yazsın
        // Köln ise 2 kişilik yazdıeın 2 kişi için uçak bileti fiyatını hesaplayın
        //son olarak yolculuğu check edin. konsolda frankfurt iki kişilik yazsın
        //Bakiyemi belirtin, toplam tutarı belirtin, double para üstü hesaplayın,yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Frankfurt :60 km\nKöln :80km\nkm basına 5 euro ücretlendirme yapılır");
        System.out.println("Yolculuk yapacağınız sehri seçin");
        String hedef = scan.next().toUpperCase();





    }
}
