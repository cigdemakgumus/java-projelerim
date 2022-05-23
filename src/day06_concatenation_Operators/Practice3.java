package day06_concatenation_Operators;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //String girildiğinde ilk iki karakteri hariç string return eden java praogramı yazınız
        //Ancak ilk karakter 'g' VE İKİNCİ KARAKTERİ 'h' ise bu karakterlerde return edilsin
          //örn:  goat gat            photo  hoto         kalem  lem      ghost  ghost ........

        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen bir kelime girin");
        String str= scan.next();

        if (str.startsWith("gh")){
            System.out.println(str);
        }else if (str.startsWith("g")){
            System.out.println(str.charAt(0)+str.substring(2));
        }else if (str.charAt(1)=='h') {
            System.out.println(str.charAt(0) + str.substring(2));
        }else System.out.println(str.substring(2));



    }
}
