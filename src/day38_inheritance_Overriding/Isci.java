package day38_inheritance_Overriding;

public class Isci extends Personel {

    public String statü="day38_inheritance_Overriding.Isci";
   public String haklar="işçiler kıdem tazminatı alır";
   public String ikramiye="işçiler ikramiye yılda 1 alır";

    public void mesai(){
        System.out.println("Tüm işçiler haftalık 40 saat calısır");
    }
    public void maasHesapla(){
        System.out.println("Tüm personel 30 gün, 8 saat 11 euro="+(30*8*10)+"euro maasla calışır");
    }
}
