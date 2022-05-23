package Practice1;

public class Araba {
   private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {

    }

    public Araba(int motor, int yil) {
        this.motor = motor;
        this.yil = yil;
    }

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
       // this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("Bu cc de motor olmaz");
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("Bu yılda araba yoktur");
        }
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
