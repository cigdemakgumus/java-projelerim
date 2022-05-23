package day23_multiDiamaionalArrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        //Aşağıdaki arrayin tüm elemenlarının toplamını birer birer bulan her bir sonucu yeni bir array in elemanı yapan
        // ve yeni arrayi ekrana yazdıran prog yazınız

        int arr[][]={{1,2,3},{4,5},{6,7}};

        int yeniArr[]=new int[arr.length];



        for (int i = 0; i <arr.length ; i++) {
            int toplam=0;
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];

            }
            yeniArr[i]=toplam;

        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
