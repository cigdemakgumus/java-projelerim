package day38_inheritance_Overriding;

public class Ustabasi extends Isci {

    String statü="Ustabası";
    String haklar="Ustabası haftada 1 gün izin  hakkına sahiptir";

    public void mesai(){
        System.out.println("Arıza varsa ustabası ekstra ucret olmadan calısır calısır");
    }
    public void maasHesapla(){
        System.out.println("Tüm personel 30 gün, 8 saat 10 euro="+(30*8*10)+"euro maasla calışır");
    }

    public static void main(String[] args) {
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statü);
        System.out.println(yasin.haklar);
        System.out.println(yasin.ikramiye);
        System.out.println(yasin.izin);
        yasin.maasHesapla();
        yasin.mesai();

        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statü);
        System.out.println(ahmet.haklar);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izin);
        ahmet.maasHesapla();
        ahmet.mesai();

        Personel adem=new Ustabasi();
        System.out.println(adem.statü);
        System.out.println(adem.haklar);
        //System.out.println(adem.ikramiye);
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();
    }
}
