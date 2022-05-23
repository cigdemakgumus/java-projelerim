package day31_passValue;

public class Deneme {
    public static void main(String[] args) {
        
        int fiyat=100;

        System.out.println("method10 ile hesaplanan fiyat : "+ indirim10(fiyat));
        System.out.println("method20 ile hesaplanan fiyat: " + indirim20(fiyat));
        System.out.println("method30 ile hesaplanan fiyat : "+ indirim30(fiyat));
        System.out.println(fiyat);
    }

    private static int indirim30(int fiyat) {
        fiyat*=0.75;
        return fiyat;
    }

    private static int indirim20(int fiyat) {
     fiyat*=0.80;
     return fiyat;
    }

    private static int indirim10(int fiyat) {
        fiyat*=0.90;
        return fiyat;
    }
}
