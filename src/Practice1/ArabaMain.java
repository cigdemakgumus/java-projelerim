package Practice1;

public class ArabaMain {
    public static void main(String[] args) {

        Araba honda=new Araba();
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setRenk("kırmızı");
        Araba toyota=new Araba("avensis", "beyaz", 2000, 2020);
        Araba volvo=new Araba("s80", "füme", 2400, 2030);

        Araba haciMurat=new Araba(1200,1974);
        System.out.println(honda);
        System.out.println(volvo);
        System.out.println("sectiğiniz arac toyota : "+"  modeli :" + toyota.getModel()+ "  renk : "+ toyota.getRenk()+ "  motor gücü : " + toyota.getMotor()+ "  yılı : "+toyota.getYil());


    }
}
