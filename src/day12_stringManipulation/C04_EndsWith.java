package day12_stringManipulation;

import java.util.Scanner;

public class C04_EndsWith {
    public static void main(String[] args) {


        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi yaziniz");
        String mail= scan.next();

        if (!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi girirniz");

        }else if (mail.endsWith("@gmail.com")){
            System.out.println("e mail adresiniz kaydedildi");

        }else {
            System.out.println("lüfen yazımı kontrol ediniz");
        }
    }
}
