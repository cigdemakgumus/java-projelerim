package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();
        if (gunIsmi.equals("pazar")|| gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }else if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");
        }else {
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }

    }
}
