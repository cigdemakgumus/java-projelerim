package day36_inheritance;

public class Child extends Parent{

    Child(){
        System.out.println("Child cons. calıstı");
    }
    //tüm classlarda biz görmesek bile javanın olusturduğu default constructor vardır.
    //Extends keyword kullanan classlardaki tüm constructorların ilk satırında biz görmesek bile super() constructor
    // class vardır. yani parent classın parametresiz constructor call

    public static void main(String[] args) {
        Child child=new Child();
    }
}
