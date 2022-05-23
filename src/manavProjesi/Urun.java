package manavProjesi;

public class Urun extends Variables {

    public static void urunSec() {
        do {

            System.out.println("Lutfen almak istediğiniz urunu seciniz");
            System.out.println("1- Elma\n2- Armut\n3- Domates\n4- Soğan\n5- Cilek");
            urun = scan.nextInt();
            System.out.println("Kaç kg istediğinizi yazınız");
            kacKg = scan.nextDouble();
            listeyeEkle+=toplamTutar;
            toplamTutar();
            urunEkle();
        } while (urunEkle.equalsIgnoreCase("Evet"));


    }
    private static void urunEkle() {
        System.out.println("Sepetinize ürün eklemek ister misiniz. Evet yada Hayır yazın");
        urunEkle = scan.next();
        if (urunEkle.equalsIgnoreCase("Evet")) {
            urunSec();
            toplamTutar();
        } else if (urunEkle.equalsIgnoreCase("Hayır")) {
           toplamTutar();
            cıkıs();
        } else System.out.println("Yanlış giriş yaptınız");
    }


    private static void toplamTutar() {
        try {
            toplamTutar=listeyeEkle;
            toplamTutar += kacKg * fiyatList.get(urun - 1);
        }catch (Exception e){
        }
    }
    private static void cıkıs(){
        System.out.println("Toplam Tutar : "+toplamTutar);
        System.out.println("Bizi tercih ettiğiniz için tesekkür ederiz");
    }
}