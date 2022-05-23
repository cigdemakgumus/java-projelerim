package day22_arrays;

public class Practice2 {
    public static void main(String[] args) {

        //Dizi elemenlarının ortalama değerini hesaplayın ve ortalamadan buyuk olanları yazdırın.

        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;
        int ort=0;


        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
            ort = toplam / arr.length;
        System.out.println("Ortalama değeri: "+ort);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ort) {

                System.out.println("Ortalamadan buyuk olanlar :" + arr[i]);
            }
        }












    }
}
