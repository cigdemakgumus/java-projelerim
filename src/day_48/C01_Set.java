package day_48;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //Vereilen bir arrayin tekrar eden elementlerini sadece 1 kez yazdıran bir method oluşlturun
        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdir(arr);
    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {

        Set<Integer> tekrarsizElemanKumesi=new HashSet<>();
        for (Integer each:arr
        ) {
            tekrarsizElemanKumesi.add(each);

        }
        System.out.println(tekrarsizElemanKumesi);
    }
}
