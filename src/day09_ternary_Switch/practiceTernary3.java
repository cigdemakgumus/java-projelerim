package day09_ternary_Switch;

public class practiceTernary3 {
    public static void main(String[] args) {

        // Final notu tanımlayın
        // A  Gayet basarılı
        // B Basarılı
        // C Ha gayret   Bunun dısındakilere Diğerleri yazdırın

        char not= 'C';
        String sonuc="";
        sonuc= (not=='A')?("Gayet basarili"):(not=='B')?("Basarılı"):(not=='C')?("Ha gayret"):("Diğerleri...");
        System.out.println(sonuc);
    }
}
