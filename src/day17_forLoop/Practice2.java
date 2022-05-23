package day17_forLoop;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        // arr1[]={{1,2},{3,4,5}{6}}
        // arr2[]={{7,8,9},{10,11},{12}}
        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};


        int yeniArray[]=new int[arr1.length];
        int yeniArray2[]=new int[arr2.length];


        for (int i = 0; i < arr1.length; i++) {
            int toplam1=0;
            for (int j = 0; j < arr1[i].length; j++) {
                toplam1+=arr1[i][j];

            }
           yeniArray[i]=toplam1;
        }
        System.out.println(Arrays.toString(yeniArray));

        for (int i = 0; i <arr2.length ; i++) {
            int toplam2=0;
            for (int j = 0; j < arr2[i].length; j++) {
                toplam2+=arr2[i][j];

            }
            yeniArray2[i]=toplam2;

        }
        System.out.println(Arrays.toString(yeniArray2));

    }
}
