package day13_stringManipulation;

public class C01_Substring {
    public static void main(String[] args) {

        String str= "Java ile IT cok guzel";

        System.out.println(str.substring(5)); // ile IT çok güzel
        System.out.println(str.replace("Java","Mehmet Hoca")); // Mehmet hoca ile IT cpk guzel
        System.out.println("Mehmet Hoca " + str.substring(5)); // Mehmet hoca ile IT cok guzel
        System.out.println(str.substring(0,5)); // Java döndürür
        System.out.println(str.substring(0,1)); // J döndürür
        System.out.println(str.substring(6,7)); // l döndürür
        System.out.println(str.substring(7,7)); // Hiçlik döndürür
        System.out.println(str.substring(str.length()-1)); // l döndürür
        System.out.println(str.substring(str.length()-5)); // guzel döndürür
        System.out.println(str.substring(str.length()));// hiçlik döndürür



    }
}
