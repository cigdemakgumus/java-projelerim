package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz. Kadınsanız'K', Erkekseniz 'E' giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yaşinizi giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet=='K' && yas>=60){
            System.out.println("Emekli olabilirsin");

        }else if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilirsin");

        }else {
            System.out.println("Emekli olamazsın");
        }
    }
}
