package day17_forLoop;

public class C08_ForLoop {
    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.

        String input="java";
        palindromKontrolEt(input);

    }

    private static void palindromKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        System.out.println("Girdiğiniz kelimenin tersten yazılışı : "+ terstenInput );

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiğiniz kelime palindromdur");
        }else {
            System.out.println("Girdiğiniz kelime palindrom değildir");
        }
    }
}
