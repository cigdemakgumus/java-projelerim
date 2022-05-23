package day23_multiDiamaionalArrays;

public class Practice3 {
    public static void main(String[] args) {

        //Girilen Multidimensional arraydaki çift sayıları toplayan bir method yazın
        int arr[][]={{1,3,6},{2,8},{5,7,9,14}};

        ciftSayilarToplami(arr);
    }

    private static int ciftSayilarToplami(int[][] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0) {
                    toplam += arr[i][j];
                }
            }
            System.out.println(toplam);
        }
        return toplam;
    }
}
