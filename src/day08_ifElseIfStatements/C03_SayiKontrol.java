package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        //kullanıcıdan 2 sayı isteyin
        //sayıların iksi de pozitif ise sayıların toplamını yazdırın
        //sayıların ikisi de negatif ise sayıların çarpımını yazdırın
        //sayıların ikisi de farklı işaretlere sahipse
        //"farklı işaretlerde sayılarla işlem yapamazsın" yazdırın
        //sayılardan sıfıra esit olan varsa "sıfır carpmaya göre yutan elemendır" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayı da pozitif oldugundan toplamları=" + (sayi1+sayi2));

        }else if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayi da negatif oldugundan carpımları=" + (sayi1*sayi2));

        }else if ((sayi1*sayi2)<0){
            System.out.println("Farklı işaretlerde sayılarla işlem yapamazsın");

        }else {
            System.out.println("sıfır carpmaya göre yutan elemandir");
        }



    }

}
