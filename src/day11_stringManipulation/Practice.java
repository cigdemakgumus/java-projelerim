package day11_stringManipulation;




public class Practice {
    public static void main(String[] args) {
        //Bir string içindeki tüm karakterleri en fazla bir kere yazdıran method yazın örn: aaabbbbbcccdddd
        String str = "";
        str="aaabbbccc";
        birKez(str);
    }

    private static void birKez(String str) {


        String sonuc = "";
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) { // sonuc konteynırında içermiyorsa ekle
                sonuc += str.substring(i, i + 1);
            }


        }
        System.out.println(sonuc);

    }

}
