package day01;

import java.util.Scanner;

public class M03_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       //System.out.print("Lütfen İsminizi Giriniz: ");
       //String isim= scan.next(); //scan.next() kullanıcının yazdığı metni ilk boşluğa kadar alır
       //System.out.print("Lütfen Soyadınızı Giriniz: ");
       //scan.nextLine();
       //String surname= scan.nextLine();

       //System.out.println("isim = " + isim+" "+surname);



        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

        System.out.println("_________________________________________________________________________________________");
        System.out.print("Adınız: ");
        String name= scan.nextLine();
        System.out.print("Soyadınız: ");
        String surname2= scan.nextLine();
        System.out.print("Yaşınız:");
        int age= scan.nextInt();
        System.out.print("Mail Adresiniz: ");
        String mail= scan.next();
        System.out.print("Şifreniz: ");
        String pass= scan.next();
        System.out.println(" *****       KAYIT BAŞARILI      *****");
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surname2);
        System.out.println("Yaşınız: "+age);
        System.out.println("Mail Adresiniz: "+mail);
        System.out.println("Şifreniz: "+pass);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");












    }
}
