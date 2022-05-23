package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda_02 {
    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(34, 22, 16, 11, -35, 20, 63, 21, -8, 38, 15));
       ciftKarePrint(sayi);

    }

    public static void ciftKarePrint(List<Integer> sayi) {
       sayi.stream().filter(Lambda_01::ciftBul).map(t-> t*t).forEach(Lambda_01::yazdir);

        }
    public static void tekkupbirfazla(List<Integer> sayi){
        sayi.stream().filter(t-> t%2==1).map(t->(t*t*t)+1).forEach(Lambda_01::yazdir);
    }
    public static void ciftelemkarakokyazdir(List<Integer> sayi){
        sayi.stream().filter(Lambda_01::ciftBul).map(Math::sqrt).forEach(t-> System.out.println(t+" "));
    }
    public static void maxeleman(List<Integer> sayi){
        System.out.println(sayi.stream().reduce(Math::max));
    }



}
