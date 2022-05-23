package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz

        char ilkHarf='m';
        char sonHarf='t';

        for (char i = ilkHarf; i <= sonHarf; i++) {
            System.out.println(i + " ");

        }
    }
}
