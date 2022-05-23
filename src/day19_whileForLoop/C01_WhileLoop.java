package day19_whileForLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

       //Kullanıcıdan bir sayı alın ve bu sayıyı tam bölen sayıları ve toplam kac tane olduklarını ekrana yazdırın

        int input=30;
        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen+" ");

                sayac++;
            }
            bolen++;


        }
        System.out.println("");
        System.out.println(input+" sayisini tam bölen "+sayac +" adet sayi vardir");

    }
}
