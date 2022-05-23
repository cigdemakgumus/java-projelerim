package day33_varrags_StringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12," edin"));
        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8));

        System.out.println(sb1.reverse());
        System.out.println(sb1.reverse());

        //System.out.println(sb1==str); Farklıtürler karsılastırılmaz,

    }
}
