package day12_stringManipulation;

public class C05_Replace {
    public static void main(String[] args) {


         String str="Bugun ne cok sey ogrendik";
                     // bu cumledeki bosluk disindaki karakter sayisini bulunuz

        System.out.println("Space dişindaki karakter sayisi : " + str.replace(" ","").length());

        System.out.println("orijinal str krakter sayisi : " + str.length());

                 // str da kalici degisiklik yapalim
                 // bugun yerine yarin
                 // ogrendik yerine ogrenecegiz

        str= str.replace("Bugun","yarin") ;
        str= str.replace("ogrendik","ögrenecegiz");

        System.out.println(str);



    }
}
