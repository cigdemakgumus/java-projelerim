package day39_overriding;

public class Toyota extends Araba{

    String hiz="Toyota hızlıdır";
    String marka="Toyota";
    String sirketMerkezi="japonya";

    public void motor(){
        System.out.println("Toyota araclar toyota marka arac kullanır");
    }
    public void garanti(){
        System.out.println("Motoru garantilidir");

    }
}
