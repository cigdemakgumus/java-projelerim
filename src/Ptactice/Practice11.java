package Ptactice;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {

        //String girildiğinde ilk iki karakteri hariç string return eden java programı yazınız
        // Ancak ilk karakter 'g' VE İKİNCİ KARAKTERİ 'h' ise bu karakterlerde return edilsin
        //örn:  goat gat            photo  hoto         kalem  lem      ghost  ghost ........

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime girin");
        String kelime = scan.next();

        ilkikisiz(kelime);
    }

    private static String ilkikisiz(String kelime) {
        String kalanHarf="";
        if (kelime.startsWith("gh")){
            System.out.println(kalanHarf=kelime);
        }else if (kelime.startsWith("g")){
            System.out.println(kalanHarf=kelime.charAt(0)+kelime.substring(2));
        }else if (kelime.charAt(1)=='h'){
            System.out.println(kalanHarf=kelime.substring(1));
        }else System.out.println(kelime.substring(2));
        return kalanHarf;
    }
}
