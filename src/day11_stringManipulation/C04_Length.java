package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {

        // kullanıcıdan ismini alip bas harfini ve son harfini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim= scan.nextLine();

        System.out.println("İlk Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("Son Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length());
        String str2=null;





    }
}
