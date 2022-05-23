package day27_constructor;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1=new Toyota();
        System.out.println(t1.marka);
        System.out.println(t1.tekerAdeti);
        System.out.println(t1.model);
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2022;
        t1.maxHiz();

        Toyota t2=new Toyota();
        System.out.println(t2.model);
        t2.model="yaris";
        t2.yakit="Benzin";
        t2.yil=2021;
        System.out.println("T2 Model :" + t2.model + ", yakit :"+ t2.yakit + ", yil :"+ t2.yil);
    }
}
