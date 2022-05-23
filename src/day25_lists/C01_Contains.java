package day25_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String>harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler);
        harfler.add("B");
        harfler.add(1,"L");
        System.out.println(harfler);
        harfler.set(3,"D");
        System.out.println(harfler);
        harfler.remove(4);
        System.out.println(harfler);
        Collections.sort(harfler);
        System.out.println(harfler);
        System.out.println(harfler.contains("L"));
        System.out.println(harfler.contains("M"));
        System.out.println(harfler.size());
        harfler.clear();
        System.out.println(harfler);
        System.out.println(harfler.isEmpty());



    }
}
