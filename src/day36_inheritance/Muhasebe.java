package day36_inheritance;

public class Muhasebe extends Personel {
    protected int saatUcreti;
    protected String statü;
    protected int maas;

    protected int mmasHesapla(){
        int maas=saatUcreti*8*30;
                return maas;
    }
}
