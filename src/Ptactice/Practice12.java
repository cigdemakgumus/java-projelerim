package Ptactice;

import java.util.Scanner;

public class Practice12 {
    static Scanner scan=new Scanner(System.in);
    static int bakiye=1000;

    public static void main(String[] args) {
        System.out.println("Bankamıza hoşgeldiniz.");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçin.\nBakiye sorgulama için 1\nPara cekme için 2" +
                "\nPara yatırma icin 3\nçıkış için 4\ntuşuna basın");

        islem();
    }
        private static void islem() {
            System.out.println("Lütfen Bir işlem secin");
            int islem=scan.nextInt();

        switch (islem) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatir();
                break;
            case 4:
                cıkıs();


        }
        }

    private static void cıkıs() {
        System.out.println("İşleminiz sona erdi");

    }

    private static void paraYatir() {
        System.out.println("Ne kadar para yatıracaksanız giriniz");
        int yatacakPara=scan.nextInt();
        bakiye+=yatacakPara;
       karar();

    }

    private static void paraCek() {
        System.out.println("Cekeceğiniz miktarı girin");
        int cekilen=scan.nextInt();
        if (cekilen<bakiye){
            System.out.println("Kalan bakiyeniz :"+ (bakiye-cekilen));
        }else System.out.println("Yetersiz bakiye");
        karar();

    }


    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz :" + bakiye);
        karar();

    }

    private static void karar() {
        System.out.println("işleme devam etmek için 1 " + " işlemi sonlandırmak için 0 a basın");
        int karar = scan.nextInt();
        if (karar == 1) {
            islem();
        } else cıkıs();
    }

}
