package day23_multiDiamaionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]= {{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10
        System.out.println(Arrays.toString(arr[0]));//ilk inner arrayin elementin tümünü yazdırmak için [3,1,7]
        System.out.println(Arrays.toString(arr));//[[I@511baa65, [I@340f438e] tüm elementleri bir array olarak bu şekilde yazdıramayız

        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]] deeptostring methoduyla tüm arrayi yazdırırız



    }
}
