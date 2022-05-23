package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        List<Integer>sayilarList=new ArrayList<>();
        sayilarList.add(5);
        sayilarList.add(3);
        System.out.println(sayilarList);
        sayilarList.add(1,6);
        System.out.println(sayilarList);

    }
}
