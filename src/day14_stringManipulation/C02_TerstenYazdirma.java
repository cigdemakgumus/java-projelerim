package day14_stringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

        //Kullanıcıdan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdırın.

        String input= "Mavi";

        String tersStr=input.substring(3).toUpperCase()+
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
        System.out.println(tersStr);

    }
}
