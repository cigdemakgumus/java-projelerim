package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        List<String>isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oguzhan");

        isimler.remove("Oguzhan");
        System.out.println(isimler);
        boolean sonuc=isimler.remove("Oguzhan");
        if (sonuc==true){
            System.out.println("İstediğiniz isim silindi");
        }else {
            System.out.println("İstediğiniz isim listede olmadığından silinemedi");
        }
        isimler.remove(1);
        System.out.println(isimler);

        isimler.set(1,"seckin");
        System.out.println(isimler);

        List<String>logListesi=new ArrayList<>();
        logListesi.add(isimler.set(1,"Cosmos"));
        System.out.println(isimler);
        System.out.println(logListesi);

        isimler.get(1);
        System.out.println(isimler);

    }
}
