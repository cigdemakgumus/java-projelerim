package kahveMakinesi;

import java.util.Scanner;

public class SutEkleme {
    SutEkleme(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kahvenize sut ister misiniz : ");
        System.out.println("Lutfen seciminizi yapın :\nEvet 1\nhayır 2\n");
        int secim= scan.nextInt();

        if (secim==1){
            System.out.println("Kahveniz sutlu");
            Variable.sutluMu="Sütlü";

        }else if (secim==2){
            System.out.println("Kahveniz sutsuz");
            Variable.sutluMu="Sutsuz";
        }else System.out.println("Yanlış giriş yaptınız");
        SekerEkleme seker=new SekerEkleme();


    }
}
