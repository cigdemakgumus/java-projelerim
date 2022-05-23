package day11_stringManipulation;

public class C02_Equals {
    public static void main(String[] args) {

        String str1= "ALI CAN";
        String str2= ("Ali" + " Can");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.toUpperCase().equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
