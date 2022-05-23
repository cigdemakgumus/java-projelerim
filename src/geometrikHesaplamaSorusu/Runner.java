package geometrikHesaplamaSorusu;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("cember yaricapı giriniz");
        double yaricap= scan.nextDouble();
        Cember circle=new Cember(yaricap);
        circle.cevreHesaplama(yaricap);
        circle.alanHesaplama(yaricap);

        System.out.println("karenin kenar uzunluğunu giriniz");
        int kenar=scan.nextInt();
        Kare sguare=new Kare(kenar);
        sguare.alanHesaplama(kenar);
        sguare.cevreHesaplama(kenar);

        System.out.println("dikdörtgenin uzun kenar ve kısa kenar giriniz");
        double uzunkenar=scan.nextDouble();
        double kisakenar= scan.nextDouble();
        Dikdortgen rectengle=new Dikdortgen(uzunkenar, kisakenar);
        rectengle.alanHesaplama(uzunkenar,kisakenar);
        rectengle.cevrehesaplama(uzunkenar,kisakenar);




    }
}
