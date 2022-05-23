package day17_forLoop;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {


        //Aşağıdaki array'in iç Array'lerindeki tüm elamanların toplamını birer birer bulan ve her bir sonucu
        //yeni bir array'in elamanı yapan ve yeni array'i ekrana yazdıran Bir program yazınız.
        int arr[][]={{1,2,3},{4,5},{6,7}};


        int yeniArr[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int toplam=0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];

            }
            yeniArr[i]=toplam;

        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
