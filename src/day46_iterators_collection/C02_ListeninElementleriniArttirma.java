package day46_iterators_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class C02_ListeninElementleriniArttirma {
    public static void main(String[] args) {

        //Verilen listedeki her elementi 3 arttırın

        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);
        //listenin tum elementlerini bize getirmesi için iteratorın hasnext ve next methodları kullanılır


     Iterator itr=liste.iterator();

        while (itr.hasNext()) {//yanında element oldugu müdeetce calışacak
            System.out.println(itr.next());
        }

        itr.hasNext();
        itr.remove();
        System.out.println(liste);
    }
}
