package day09_ternary_Switch;

public class C07_Practic2 {
    public static void main(String[] args) {
        // verilen sayının 3 veya daha cok basamaklı olup olmadığını kontrol eden
        // ve sonucu yazdıran ternary olusturun

        int sayi= 502;
        String sonuc= sayi>=100 ? "sayı en az 3 basamaklıdır" : "sayı üç basamaklı değildir";
        System.out.println(sonuc);

    }
}
