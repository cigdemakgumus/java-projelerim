package Ptactice;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {

        //Kullanıcıdan bir isim isteyin ve isim sadece 3 harfli olsun.Ternary kullanarak harflerin farklı olup olmadığına bakın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim girin");
        String isim = scan.next();
        char c1=isim.charAt(0);
        char c2=isim.charAt(1);
        char c3=isim.charAt(2);
    String sonuc= c1==c2 ? ("1.harfle 2.harf aynı"):(c2==c3)?("2.harfle 3.harf aynı"):(c1==c3)?("1.harfle 3.harf aynı"):("harfler farklı");
        System.out.println(sonuc);
    }
}
