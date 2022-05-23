package kahveMakinesi;

import java.util.Scanner;

public class BoySecimi {

    BoySecimi() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kahvenizi hangi boyda istersiniz");
        System.out.println("lutfen secim yapın :\nKucuk boy 1\nOrta boy 2\nBuyuk boy 3\n");
        int secim = scan.nextInt();


            switch (secim) {
                case 1:
                    System.out.println("kahveniz kucuk boy");
                    Variable.hangiBoy = "Kucuk boy Kahve";
                    break;
                case 2:
                    System.out.println("Kahveniz orta boy");
                    Variable.hangiBoy = "Orta boy kahve";
                    break;
                case 3:
                    System.out.println("Kahveniz buyuk boy");
                    Variable.hangiBoy = "Buyuk boy kahve";
                    break;
                default:
                    System.out.println("Yanlış secim yaptınız");


            }

        System.out.println("Secimleriniz : " + Variable.hangiKahve +" "+ Variable.sutluMu +" "+ Variable.sekerliMi +" "
                + Variable.hangiBoy+ " siparişi verdiniz");
        System.out.println("Bizi tercih ettiğiniz için tesekkur ederiz");

    }
}
