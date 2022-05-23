package day23_multiDiamaionalArrays;

public class Practice2 {
    public static void main(String[] args) {

        //aynı indexe sahip elemanların toplamını yazdıran bir program yazın
        // arr1[][]={{1.2},{3,4,5},{6}};
        // arr2[][]={{7,8,9},{10,11},{12}};

        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};
        int toplam=0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length==arr2[i].length);
            for (int j = 0; j < arr1[i].length; j++) {
                toplam+=arr1[i][j]+arr2[i][j];
                System.out.println("Toplam ["+i+"]["+j+"]="+ toplam);
            }
            if(arr2[i].length<=arr1[i].length){
                for (int j = 0; j < arr2[i].length; j++) {
                    toplam+=arr1[i][j]+arr2[i][j];
                    System.out.println("Toplam ["+i+"]["+j+"]="+ toplam);

                }
            }


        }

    }
}

