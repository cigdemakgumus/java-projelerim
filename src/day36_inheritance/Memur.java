package day36_inheritance;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
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

        Memur memur1=new Memur();
        //memur objesi memur clasınıun objesi olmasına rağmen inherit ettiği muhasebe ve onun da parentı olan personel
        // claslarından tüm dataları alabilir

        //personel classından
        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.soyIsim="Tepecik";
        memur1.tel="3125755437654";

        //Muhasebe classından
        memur1.saatUcreti=10;
        memur1.maas=memur1.mmasHesapla();
        memur1.statü="Memur";
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.mmasHesapla();
        System.out.print(memur2);



    }


}
