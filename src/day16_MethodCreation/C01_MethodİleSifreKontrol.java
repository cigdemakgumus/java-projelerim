package day16_MethodCreation;

public class C01_MethodİleSifreKontrol {
    public static void main(String[] args) {


        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali

        String sifre="Abc123ab";

        boolean ilkHarf = ilkHarfKontrolEt(sifre);
        boolean sonHarf = sonHarfKontrolEt(sifre);
        if (ilkHarf && sonHarf){
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }

    }


    public static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf = sifre.charAt(sifre.length() - 1);
        boolean sonHarfSonuc = false;

        if (sonHarf >= 'a' && sonHarf >= 'z') {
            sonHarfSonuc = true;

        } else {
            System.out.println("Lütfen son harfi kucuk yazin");
        }
        return sonHarfSonuc;

    }



    public static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf = sifre.charAt(0);
        boolean ilkHarfSonuc = false;
        if ((ilkHarf >= 'A') && (ilkHarf <= 'Z')) {

        } else {
            System.out.println("Lutfen ilkharfi buyuk harf yazın");
        }
        return ilkHarfSonuc;


    }
}


