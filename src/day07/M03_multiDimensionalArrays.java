package day07;

import java.util.Arrays;

public class M03_multiDimensionalArrays {
    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
     */

    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String arr []= str.split(" ");
        int toplam$=0;
        int toplam£=0;
       System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                toplam$+=Integer.parseInt(arr[i].replace("$",""));

            }else{
                toplam£+=Integer.parseInt(arr[i].replace("£",""));
            }
        }

        System.out.println("Dolar Sipariş Toplamı: "+toplam$);
        System.out.println("Pound Sipariş Toplamı: "+toplam£);

    }
}
