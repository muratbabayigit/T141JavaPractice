package day07;

import java.util.Arrays;
import java.util.Scanner;

public class M01_Arrays {
    //kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    //kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
    //elemaninin arasindaki farki gosteren java programi yazin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen array değerini giriniz:");
        int sayi= scan.nextInt();

        int arr[]=new int[sayi];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+".sayıyı giriniz: ");
            int sayi2= scan.nextInt();
            arr[i]=sayi2;
        }
       // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("En büyük eleman ile En Küçük Eleman arasındaki fark: "+(arr[arr.length-1]-arr[0]));
    }

}
