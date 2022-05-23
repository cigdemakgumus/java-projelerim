package day09_ternary_Switch;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi=scan.nextInt();

        if (sayi>=0){
            if (sayi>100) {
                System.out.println("sayı 100 den buyuktur");
            }else {
                System.out.println("sayı 100 den kucuktur");
            }

        }else{
            if (sayi > -100){
                    System.out.println("sayı -100en buyuk");

            }else {
                System.out.println("sayı -100den kucuk");
            }
            }


    }
}
