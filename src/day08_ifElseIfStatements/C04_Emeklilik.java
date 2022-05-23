package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        //eger calışan kadınsa 60 yasından buyuk olduğunda emekli olabilir,
        //calısan erkekse 65 yasından buyukse emekli olabilir
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyeinizi giriniz" + "\n" +
                "Kadın icin K \n" +
                "erkek icin E harfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasınızı giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='K') {
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerlerini kontrol edin");
            }else if (yas<60){
                System.out.println("emekli olamazsın daha " + (60-yas) + "yil daha calisman gerekir");

            }else {
                System.out.println("emekli olabilirsin");
            }
        }else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("lutfen girdiginiz yas degerlerini kontrol edin");
            }else if (yas<65){
                System.out.println("emekli olamazsın daha " + (65-yas) + "yıl calısman gerekir");
            }else {
                System.out.println("emekli olsbilirsin");
            }

        }else {
            System.out.println("lutfen cinsiyet icin gecerli bir harf giriniz");
        }


    }
}
