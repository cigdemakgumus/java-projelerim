package day12_stringManipulation;

import java.util.Scanner;

public class C01_IndexOf {
    public static void main(String[] args) {


        String str1= "java bir baska guzel valla cok guzel";

        System.out.println(str1.indexOf('a',5)); //  5.indexten sonraki a hsrfininin indexini döndürdü.

        int ilkindex= str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkindex+1)); // ikinci a harfinin indexini döndürdü.

        System.out.println(str1.indexOf("guzel",20));
        System.out.println(str1.indexOf('b',6));
        System.out.println(str1.indexOf('y'));


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi yazınız");
        String mail= scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");
        }




    }
}
