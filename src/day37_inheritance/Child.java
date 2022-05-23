package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int s){
        System.out.println("Chils class parametreli cons");
    }
    Child(int sayi1, int sayi2){
        super(sayi1,sayi2);
        System.out.println(" Child iki parametreli cons");
    }

    public static void main(String[] args) {
        Child child=new Child();
    }
}
