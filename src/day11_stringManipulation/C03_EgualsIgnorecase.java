package day11_stringManipulation;

import java.util.Scanner;

public class C03_EgualsIgnorecase {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz? Evet yada Hayir giriniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")
        ) {
            System.out.println("cevabiniz :" + cevap + " derse katiliminiz onaylandi");

        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz:" + cevap + " sonraki derslere bekleriz");

        }else {
            System.out.println("Lutfen evet ya da hayir giriniz");
        }

    }
}
