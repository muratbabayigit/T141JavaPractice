package day07;

import java.util.Arrays;

public class M02_multiDimensionalArrays {
    // multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
    // birer bulan ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
    // yazdıran programı yaziniz.
    // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

    public static void main(String[] args) {
        int arr [][]={{20,15,45},{4,12,35},{6,7,20,57,125,369,258},{10,20,50,15,505}};

        int toplamsArr[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {

                toplamsArr [i] += arr[i][j];
                
            }
            
        }
        System.out.println(Arrays.toString(toplamsArr));

    }
}
