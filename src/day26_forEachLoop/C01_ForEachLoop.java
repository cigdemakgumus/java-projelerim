package day26_forEachLoop;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,11};
        // elementleri for loop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        // bunu for-each loop ile yapacak olursak
        // for-each loop'u calistirmak icin hedef bir collection vermeliyiz
        for (int eatch:arr
             ) {
            System.out.print(eatch+" ");
        }

    }
}
