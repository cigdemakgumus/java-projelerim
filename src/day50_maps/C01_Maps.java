package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        //sınıftaki öğrenci listesini düzenli olarak yazdıralım

        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);


        /* Eger key'lere tek tek ulasmak istersek
           index yapisina ihtiyacimiz var
           ancak map index yapisini desteklemez
           bunun icin key'leri once bir set'e
           sonra da set'in tum elementlerini bir list'e ekledik
         */

        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySeti);


        //Simdi de value leri index ile ulasabileceğimiz bir sekle sokalım

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl);
        System.out.println(sinifValueColl);
        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList);
        /* her bir value birden fazla bilgiyi iceriyor
          onun icin value'leri multidimensional bir array'e atmak mantikli duruyor
          ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var
         */
        int outerArrayBoyut = sinifValueList.size();
        // inner array'lerin boyutunu bulmak biraz daha kompleks olacak
        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;
        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDArr[i][j] = temp[j];


            }
        }
    }
}

