package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        //girilen bir  karakterin harf olup olmadığını bulalım
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter girin");
        char karakter = scan.next().charAt(0);

        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
            System.out.println("girdiginiz karakter bir harf");
        } else {
            System.out.println("girdiginiz karakter harf degil");
        }
    }
}


