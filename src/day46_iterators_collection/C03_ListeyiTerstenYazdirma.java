package day46_iterators_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenYazdirma {
    public static void main(String[] args) {

        //Verilen listeyi iterator ile sondan başa doğru yazdıralım
        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        //once iteratoru olusturup sonra yollayalım.
      ListIterator itr=liste.listIterator();

      while (itr.hasNext()){
          itr.next();
        }
        while (itr.hasPrevious()){
            System.out.println(itr.previous()+"");
        }
    }
}
