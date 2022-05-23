package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary de ıkı sonucun data turleri farklı olabilir
        // verilen sayı 100 den buyukse sayının karesini alıp yazdıran,
        //100 den kucukse "sayı 100 den buyuk olmalı" yazdıran bir ternary olusturalım

        int sayi= 50;
        //ternary bize sonuc getirdiğinden ya sonucu direk yazdırmalıyız
        //veya bir degışkene atamalıyız
        // EGER SONUCLAR FARKLI DATA TURLERINDE ISE ATAMA YAPACAGIMIZ VARIABLE IN DATA TURU TEK OLACAGINDAN
        // ATAMA YAPAMAYIZ SADECE DİREK YAZDIRABİLİRİZ

        System.out.println(sayi>100 ? sayi*sayi : "sayi 100 den buyuk olmalı");

    }
}
