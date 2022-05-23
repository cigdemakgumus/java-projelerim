package Ptactice;

import java.util.Arrays;

public class Practice15 {
         /*
         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}
         int 2D arrayini  olustur
        2D arrayinden max number print et
     */
        /*public static void main(String[] args) {
          int[][] i1 = new int[][]{{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
            int max = 0 ;
            for( int i = 0 ; i < i1.length ; i++){
                for(int j =0 ; j< i1[i].length ; j++){
                  if(i1[i][j] > max){
                        max = i1[i][j];
                    }
                }
            }
            System.out.println(max);
         */
         public static void main(String[] args) {
             int arr[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
             //int max=Integer.MIN_VALUE;
             //System.out.println(max);
             int max=arr[0][0];
             for (int i = 0; i < arr.length ; i++) {
                 for (int j = 0; j < arr[i].length; j++) {
                     if (arr[i][j]>max){
                         max=arr[i][j];
                 }

             }

             }
             System.out.print("max sayı : " + max);
         }

}
