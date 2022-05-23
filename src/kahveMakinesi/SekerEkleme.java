package kahveMakinesi;

import java.util.Scanner;

public class SekerEkleme {

    SekerEkleme(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kahveniz sekerli mi sekersiz mi olsun ");
        System.out.println("Lutfen seciminizi yapın :\nsekerli  1\nsekersiz 2");
        int secim= scan.nextInt();
        if (secim==1){
            System.out.println("Kahveniz sekerli");
            Variable.sekerliMi="Sekerli";
        }else if (secim==2){
            System.out.println("kahveniz sekersiz");
            Variable.sekerliMi="Sekersiz";
        }else System.out.println("Yanlış giriş yaptınız");

        if (Variable.hangiKahve != "Türk Kahvesi") {
            BoySecimi boySecimi = new BoySecimi();
        }else {
            System.out.println("Secimleriniz : " + Variable.hangiKahve + " " + Variable.sutluMu + " " + Variable.sekerliMi + " " + " siparişi verdiniz");
            System.out.println("Bizi tercih ettiğiniz için tesekkur ederiz");
        }
    }
}
