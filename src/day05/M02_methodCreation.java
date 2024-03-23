package day05;

import java.util.Scanner;

public class M02_methodCreation {
    //Soru: Bir metod oluşturun ve bu metod iki sayı alıp bu sayıların toplamını döndürsün.

    /*
    Method tanımlarken
    access modifier returnType methodName(paramType param1, paramType param2)
     */
    public static double ikiSayiyiTopla(int num1,double num2){
        double a=num1+num2;
       // return num1+num2;
        return a;

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı giriniz ve enter tuşuna basınız");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("Girdiğiniz sayıların toplamı: "+ikiSayiyiTopla(sayi1,sayi2));

    }
}
