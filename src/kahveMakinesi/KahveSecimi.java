package kahveMakinesi;

import java.util.Scanner;

public class KahveSecimi {

  public KahveSecimi (){
      System.out.println("********Çiğdem Cafeye Hosgeldiniz********");
     Scanner scan = new Scanner(System.in);
     System.out.println("Lutfen kahve seciminizi yapın :\nTürk Kahvesi  : 1\nFiltre Kahve  : 2\nEspresso : 3");
     int kahveSecim=scan.nextInt();

      switch (kahveSecim) {
          case 1:
              System.out.println("Türk Kahvesini sectiniz");
              Variable.hangiKahve = "Türk Kahvesi";
              break;

          case 2:
              System.out.println("Filtre kahve sectiniz");
              Variable.hangiKahve = "Filtre Kahve";
              break;
          case 3:
              System.out.println("Espresso sectiniz");
              Variable.hangiKahve = "Espresso";
              break;
          default:
              System.out.println("Yanlış secim yaptınız");

      }
      SutEkleme sutluMu=new SutEkleme();
  }
}


