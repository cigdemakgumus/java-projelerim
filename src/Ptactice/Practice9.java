package Ptactice;

public class Practice9 {
    public static void main(String[] args) {

        //Aşagıdaki string degişkenini kullanarak konsolda ALİ yazdırın

        String harfDeposu="ABCDEFGHIJKLMNOPQRSTUVWYZ";

        char a=harfDeposu.charAt(harfDeposu.indexOf('A'));
        char l=harfDeposu.charAt(harfDeposu.indexOf('L'));
        char i=harfDeposu.charAt(harfDeposu.indexOf('I'));
        System.out.println(""+a+l+i);

    }
}
