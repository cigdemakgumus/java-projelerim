package Ptactice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
//girilen ay numarasına göre ayın kaç gün olduğunu sayı ile yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("yılın kacıncı ayını öğrenmek istiyorsunuz");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ay 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ay 30 gundur");
                break;
            case 2:
                System.out.println("Lütfen bulunduğunuz yılı giriniz");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("Girdiğiniz ay 29 gundur");
                } else System.out.println("Girdiğiniz ay 28 gundur");
                break;

            default:
                System.out.println("Doğru rakam giriniz");

        }

    }
}



