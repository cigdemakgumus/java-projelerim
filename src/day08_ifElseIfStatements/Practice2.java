package day08_ifElseIfStatements;

import java.util.Scanner;

public class Practice2 {
    //Kullanıcıdan aracın hızını alın. Trafik cezasının değerini hesaplayın.  54 hız sınırıdır.
    //Eğer hızınız 55 -  74 arası ise ceza 100 tl
    //Eğer hızınız 75 -  84 arası ise ceza 150 tl
    //Eğer hızınız 85 -  94 arası ise ceza 320 tl
    //Eğer hızınız 94 den fazla ise ceza 500 tl
    // eğer ehliyeti yoksa cezaya 200 tl daha eklenir
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ehliyetiniz varsa 1, yoksa 0 giriniz");
        int ehliyetVarMi=scan.nextInt();

        System.out.println("Lütfen hızınızı yazınız");
        double hiz=scan.nextDouble();

        if (ehliyetVarMi==1) {
            if (hiz < 0) {
                System.out.println("Hatalı giriş yaptınız");
            } else if (hiz >= 55 && hiz <= 75) {
                System.out.println("Cezanız 100 tl");
            } else if (hiz >= 75 && hiz <= 84) {
                System.out.println("Cezanız 150 tl");
            } else if (hiz >= 85 && hiz <= 94) {
                System.out.println("Cezanız 320 tl");
            } else if (hiz > 94) {
                System.out.println("Cezanız 500 tl");
            } else {
                System.out.println("Cezanız yoktur");
            }
        }
        else if (ehliyetVarMi==0){
             if (hiz < 0) {
                 System.out.println("Hatalı giriş yaptınız");
             }else if (hiz >= 55 && hiz <= 75){
                System.out.println("Cezanız 300 tl");
             }else if (hiz >= 75 && hiz <= 84) {
                 System.out.println("Cezanız 350 tl");
             } else if (hiz >= 85 && hiz <= 94) {
                 System.out.println("Cezanız 520 tl");
             } else if (hiz > 94) {
                System.out.println("Cezanız 700 tl");
             } else {
                System.out.println("Cezanız 200 tl");
             }
        }

    }

}
