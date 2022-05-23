package day11_stringManipulation;

import java.util.Locale;

public class C01_ToLowerCase_ToUpperCase {
    public static void main(String[] args) {


        String str= "java guzeldir";
        System.out.println(str.toUpperCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
    }
}
