package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a<b && b<100){
            System.out.println("istediğiniz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }
        if (a>0) System.out.println("suslu parantez olmazsa sadece 1 satir calisir");
        System.out.println("2.satir da calisti");
    }
}
