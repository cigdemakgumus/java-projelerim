package day36_inheritance;

public class Ustabasi extends Isci{
    @Override
    public String toString() {
        return "day38_inheritance_Overriding.Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statü='" + statü + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Ustabasi ustabasi1=new Ustabasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyIsim="Gokcek";
        ustabasi1.maas= ustabasi1.mmasHesapla();
        ustabasi1.statü="day38_inheritance_Overriding.Ustabasi";

        System.out.println(ustabasi1);

    }
}
