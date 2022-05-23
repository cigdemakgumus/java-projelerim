package day03scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {
        // sayi1=10  sayı2=20  degerlerinin yerlerini 3. bir variable olmadan değistirin

        int sayi1=10;
        int sayi2=20;
        int toplam=30;
        System.out.println("Swaptan önce sayı 1 : "+sayi1+" sayı 2 : "+sayi2);
        sayi1=sayi2+sayi1;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("Swaptan sonra sayı 1 : "+sayi1+" sayı 2 : "+sayi2);


    }
}
