package geometrikHesaplamaSorusu;

public class Sekil {

    public double uzunkenar;
    public double kısakenar;
    public double yaricap;
    public double pi=3.14;
    public int kenar;

    public Sekil(double uzunkenar, double kısakenar) {
        this.uzunkenar = uzunkenar;
        this.kısakenar = kısakenar;
    }
    public void cevrehesaplama(double uzunkenar, double kısakenar) {
        System.out.println("dikdörtgenin cevresi: " + (uzunkenar + kısakenar) * 2);
    }
    public void alanHesaplama(double uzunkenar, double kısakenar){
        System.out.println("dikdörtgenin alanı : "+(uzunkenar*kısakenar));
    }

    public Sekil(int kenar) {
        this.kenar = kenar;
    }
    public void cevreHesaplama(int kenar){
        System.out.println("karenin cevresi : "+(kenar*4));
    }
    public void alanHesaplama(int kenar){
        System.out.println("karenin alanı : "+(kenar*kenar));
    }

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }
    public void cevreHesaplama(double yaricap){
        System.out.println("alanın cevresi : "+(yaricap*pi)*2);
    }
    public void alanHesaplama(double yaricap){
        System.out.println("cemberin alanı: " + (yaricap*yaricap)*pi);
    }
}
