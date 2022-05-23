package day38_inheritance_Overriding;

public class Personel {

    public String statü="day38_inheritance_Overriding.Personel";
    public String haklar="Tüm personel esit haklara sahiptir";
    public String izin= "tüm personel yılda 4 hafta izin kullnır";
    public void mesai(){
        System.out.println("Tüm personel 5 gün, günde 8 saat calısır");
    }
    public void maasHesapla(){
        System.out.println("Tüm personel 30 gün, 8 saat 10 euro="+(30*8*10)+"euro maasla calışır");
    }
}
