package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi=scan.next().toUpperCase();
        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("girdiginiz gun haftasonu");
        } else {
            System.out.println("girdiginiz gun haftaici");
        }
    }
}
