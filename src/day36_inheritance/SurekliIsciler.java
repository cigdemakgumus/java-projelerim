package day36_inheritance;

public class SurekliIsciler extends Isci{

    @Override
    public String toString() {
        return "SurekliIsciler{" +
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

        SurekliIsciler surIc1=new SurekliIsciler();
        surIc1.personelNo=5001;
        surIc1.isim="Cem";
        surIc1.soyIsim="Akay";
        surIc1.statü="day38_inheritance_Overriding.Isci";
        surIc1.saatUcreti=11;
        surIc1.maas=surIc1.mmasHesapla();




    }

}
