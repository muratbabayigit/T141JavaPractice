package day02;

import java.util.Scanner;

public class M05_ifStatements {
    public static void main(String[] args) {

        /*
        Türkiye cumhuriyetinde yaşayan birisi eğer 18 yaşında veya büyükse ve TC vatandaşı ise ehliyet alabilir
        Kullanıcıdan yaşını ve TC vatandaşı olup olmadığını sorup ehliyet alabiliyorsa yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        int age= scan.nextInt();
        System.out.println("Türkiye Cumhuriyeti Vatandaşı mısınız(E/H):  ");
        char nationality= scan.next().toUpperCase().charAt(0);

        if (age>=18 && nationality=='E'){
            System.out.println("Ehliyet Alabilirsiniz");
        }


    }
}
