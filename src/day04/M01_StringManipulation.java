package day04;

import java.util.Scanner;

public class M01_StringManipulation {
    /*
     * Kullanicidan bir kelime isteyiniz ve kelime sadece 3 harfli olmalidir ternary
     * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
     * Test data: ali eme all
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 3 harfli bir kelime giriniz: ");
        String word= scan.next();

        char w1=word.charAt(0); //kelimenin 1. harfi
        char w2=word.charAt(1); //kelimenin 2.harfi
        char w3=word.charAt(2); //kelimenin 3.harfi


    String sonuc=word.length()==3 ? ((w1!=w2 && w1!=w3 && w2!=w3)?"Girilen 3 harfli kelime unique harflerden oluşuyor":
                        "Girilen 3 harfli kelime unique harflerden oluşmuyor") : "Girilen kelime 3 harfli değildir";
        System.out.println(sonuc);
    }
}
