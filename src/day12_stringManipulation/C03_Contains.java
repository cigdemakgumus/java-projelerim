package day12_stringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi yaziniz");
        String mail= scan.next();

        if (!mail.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi girin");

        }else if (mail.contains("@gmail.com")){
            System.out.println("e mail adresiniz kaydedildi");

        }else{
            System.out.println("lutfen yazimi kontrol ediniz");
        }
    }
}

