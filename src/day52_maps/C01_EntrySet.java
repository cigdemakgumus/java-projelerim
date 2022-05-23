package day52_maps;

import day49_maps.MapOlustur;


import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = MapOlustur.myMap();



        Set<Map.Entry<Integer,String>> sinifEntrySeti=sinifListMap.entrySet();

        for (Map.Entry<Integer,String>each:sinifEntrySeti
             ) {
            Integer entryKey=each.getKey();
            String valueStr=each.getValue();

            String valueArr[]=valueStr.split(", ");

        }

    }

}
