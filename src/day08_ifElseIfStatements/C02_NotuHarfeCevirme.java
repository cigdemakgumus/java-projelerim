package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double notSayi=scan.nextDouble();

        if (notSayi<0 || notSayi>100){
            System.out.println("Lutfen gecerli bir not girin");

        }else if (notSayi<50){
            System.out.println("notunuz D");
        }else if (notSayi>=50 && notSayi<=60){
            System.out.println("notunuz C");
        }else if (notSayi>=60 && notSayi<=80){
            System.out.println("notunuz B");
        }else{
            System.out.println("notunuz A");
        }
    }
}
