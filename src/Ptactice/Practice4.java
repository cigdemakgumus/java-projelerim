package Ptactice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        //Kullanıcıdan önce list uzunluğu, sonra list elemanlarını girmesini isteyin
        //Tekrarlı list elemanlarından yeni bir list olusturan method yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kaç elementlik array istediğinizi yazın");
        int uzunluk=scan.nextInt();

        System.out.println("lutfen List elemanlarını yazın");

        List<Integer>list=new ArrayList<>();

        for (int i = 0; i < uzunluk; i++) {
         list.add(scan.nextInt());

        }
        tekrarliElaman(list);

    }

    private static void tekrarliElaman(List<Integer> list) {
        List<Integer>tekrarliList=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < tekrarliList.size() ; j++) {


            }


        }


    }
}
