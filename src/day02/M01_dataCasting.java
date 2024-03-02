package day02;

import java.util.Scanner;

public class M01_dataCasting {
    public static void main(String[] args) {
        /*
        1- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu tam sayı olarak yazdırın
        ipucu: sorumluluk bende
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen onalıklı iki adet sayı giriniz");
        System.out.print("1. Sayı: ");
        double sayi1= scan.nextDouble();
        System.out.print("2. Sayı: ");
        double sayi2= scan.nextDouble();
        System.out.println("Hesaplama tamamlandı!");
        System.out.println("Sonuç:"+(int)(sayi1/sayi2));


    }
}
