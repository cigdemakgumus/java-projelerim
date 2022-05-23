package halukHocaSansliKullaniciSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici>kisiler=new ArrayList<>();
    public List<Kullanici>kayitAl(){
        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String isim= scan.nextLine();
        Kullanici k1=new Kullanici(isim, LocalDateTime.now());
        kisiler.add(k1);



        return kisiler;
    }
}
