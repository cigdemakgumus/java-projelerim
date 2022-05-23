package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdeti=4;
    boolean motoruVatMi=true;
    String model;
    String yakit;
    int yil;


    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araçlar max 240 km hiz yapar");
        }else if (yakit.equals("Dizel")){
            System.out.println("Benzinli araçlar max 260 km hiz yapar");
        }



    }
}

