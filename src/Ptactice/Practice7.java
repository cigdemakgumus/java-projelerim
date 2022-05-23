package Ptactice;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        //Bankamatik
    //Bakiye öğrenme (baslangıc bakiyesi 1000 tl), para cekme,  yatırma, ve cıkıs işlemlerinin yapıldığı bir prog yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yapacağınız işlemi seçin :\nBakiye sorgulama için 1\nPara yatırma için 2\nPara çekme icin 3\nçıkış için 4");
        int islem = scan.nextInt();
        int bakiye= 1000;

        switch (islem){
            case 1:
                System.out.println("Bakiyeniz :"+bakiye + "TL");
                break;
            case 2:
                System.out.println("Yatıracağınız miktarı girin :");
                int yatırılacakMiktar=scan.nextInt();
                bakiye+=yatırılacakMiktar;

                break;

            case 3:
                System.out.println("Çekmek istediğiniz para miktarını girin : ");
                int cekilenMiktar=scan.nextInt();
                if (cekilenMiktar<bakiye){
                    bakiye-=cekilenMiktar;
                    System.out.println("Kalan bakiyeniz :"+ bakiye);

                }else System.out.println("Bakiye yetersiz");
                break;

            case 4:
                System.out.println("Lutfen cıkışa basın");


        }


    }
}
