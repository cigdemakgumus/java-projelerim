package day39_overriding;

public class Araba {
    String hareket="Arabalar Teker ile hareket eder";
    String hiz="Arabalar motor gücüne göre hız yaparlar";
    String yakit="Arabalar farklı yakıtlar kullanılabilir";
    String marka="Arabalar uretildikleri markaya sahiptir";

    public  void motor(){
        System.out.println("Arabalar farklı markalarda mototr kullanırlar");
    }
    public void yakitTüketimi(){
        System.out.println("Arabalar motor gücüne yakit türüne göre yakıt tüketirler");
    }
}
