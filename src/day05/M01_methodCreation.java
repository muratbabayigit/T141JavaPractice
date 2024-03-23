package day05;

import java.util.Scanner;

public class M01_methodCreation {
    //Soru: Bir metod oluşturun ve bu metod bir string alıp bu string'in uzunluğunu döndürsün.

    public static int calculateStringLength(String text){

        return text.length();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız: ");
        String metin= scan.nextLine();
        System.out.println("Girilen Metnin Uzunluğu: "+calculateStringLength(metin));
    }

}
