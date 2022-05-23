package day08_ifElseIfStatements;

import java.util.Scanner;

public class practice1 {
    //Kullanıcıdan yasını ve kilosunu alınız
    //18 yasından kucukse kan bağisi yapamaz,    18 yasından buyuk ve 50 kg dan hafif ise kan bağişi yapamaz
    //18 yasından buyuk ve 50 kg dan ağır ise kan bağişi yapabilir.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        double yas= scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo=scan.nextDouble();

        if (yas<18) {
            System.out.println("Kan bağışı yapamaz");
        }else if (yas>18 && kilo<50) {
            System.out.println("Kan bağişi yapamaz");
        }  else if (yas>18 && kilo>50){
            System.out.println("Kan bağişi yapabilir");
        }
    }
}
