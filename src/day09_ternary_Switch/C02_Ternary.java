package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir tam sayı alıp tk mi cift mi yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");
        }else {
            System.out.println("sayı tek");

        }
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");
    }
}
