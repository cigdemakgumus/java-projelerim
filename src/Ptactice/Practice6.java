package Ptactice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {

        //Kullanıcıya yasadığı gune göre 100 gun sonra hangi gün olduğunu yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanın kacıncı gununde oldugunuzu yazınız: \nPazartesi: 1\nSalı :2\nÇarsamba :3\nPersembe :4" +
                "\nCuma :5\nCumartesi :6\nPazar :7\n");
        int gun = scan.nextInt();
        System.out.println("Kac gun sonrasını istediğinizi girin");
        int kacGunSonra=scan.nextInt();
        int hangıGun=(kacGunSonra+gun)%7;

        switch (hangıGun){
            case 1:
                System.out.println(" gün sonra gunlerden pazartesi");
                break;
            case 2:
                System.out.println("gün sonra gunlerden salı");
                break;
            case 3:
                System.out.println("gün sonra gunlerden carsamba");
                break;
            case 4:
                System.out.print("gün sonra gunlerden persembe");
                break;
            case 5:
                System.out.println("gün sonra gunlerden cuma");
                break;
            case 6:
                System.out.println("gün sonra gunlerden cumartesi");
                break;
            case 7:
                System.out.println("gün sonra gunlerden pazar");
                break;
            default:
                System.out.println("Lutfen doğru sayı girin");


        }










    }




}
