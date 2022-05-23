package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda_03 {
    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(34,22,16,11,35,20,63,21,65,44,66,64,81,38,15));
        sayi.stream().filter(Lambda_01::ciftBul).forEach(Lambda_01::yazdir);

        //Task : functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz

        sayi.stream().filter(t->t%2==0 && t<34).forEach(Lambda_01::yazdir);
        }




}
