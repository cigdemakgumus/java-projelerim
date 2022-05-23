package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class CalismaSayfasi {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Integer>sinifKeySet=sinifListMap.keySet();
        List<Integer>sinifKeyList=new ArrayList<>();
        sinifKeyList.addAll(sinifKeySet);

        Collection<String>sinifValueColl=sinifListMap.values();
        List<String>sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
    }
}
