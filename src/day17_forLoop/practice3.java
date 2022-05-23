package day17_forLoop;

public class practice3 {
    public static void main(String[] args) {
        //20 den 120 ye kadar 3 ile tam bölünebilen sayıları konsola yazdırın


        int sonuc=0;

        for (int i = 20; i < 120; i++) {

            if (i % 3 == 0){
              sonuc++;

            }

        }
        System.out.println(sonuc);
    }
}
