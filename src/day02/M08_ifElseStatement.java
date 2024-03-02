package day02;

import java.util.Scanner;

public class M08_ifElseStatement {
      /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */
      public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Lütfen gün ismini giriniz: ");
            String day= scan.nextLine().toLowerCase();

            if (day.equals("pazartesi")){
                  System.out.println("Bugün "+day+ " Hafta içi bir gündesiniz! İyi Çalışmalar");
            }else if(day.equals("salı")){
                  System.out.println("Bugün "+day+ " Hafta içi bir gündesiniz! İyi Çalışmalar");
            }else if(day.equals("çarşamba")){
                  System.out.println("Bugün "+day+ " Hafta içi bir gündesiniz! İyi Çalışmalar");
            } else if (day.equals("perşembe")) {
                  System.out.println("Bugün "+day+ " Hafta içi bir gündesiniz! İyi Çalışmalar");
            } else if (day.equals("cuma")) {
                  System.out.println("Bugün "+day+ " Hafta içi bir gündesiniz! İyi Çalışmalar");
            }else if(day.equals("cumartesi")){
                  System.out.println("Bugün "+day+ " Hafta sonu bir gündesiniz! İyi Tatiller");
            } else if (day.equals("pazar")) {
                  System.out.println("Bugün "+day+ " Hafta sonu bir gündesiniz! İyi Tatiller");
            }else {
                  System.out.println("Yanlış giriş yaptınız. Gün ismini tam olarak yazınız. ");
            }


      }}
