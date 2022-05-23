package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        List<Object>list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);
        list.set(1,(Integer)(list.get(1))+10);

        Map<Integer,String> sinifList=new HashMap<>();
        //bir sınıfta öğrenci no, isim ,soyisim ,brans olarak map olusturmak istiyoruz.
        //key tek bir unigue değerdir
        //ama value/değer birden fazla bilginin birleşiminden olusabilir
        // bu durumda daha sonra istediğimiz bilgilere daha doğru sekilde ulasabilmek için value aynı biçimde olusturulmalıdır
        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102, "Veli, Yan, QA");
        sinifList.put(103, "Ali, Yan, C#");

        System.out.println(sinifList);//{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}
        System.out.println(sinifList.keySet());//[101, 102, 103]
        System.out.println(sinifList.values());//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

    }
}
