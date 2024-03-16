package day04;

public class M04_forLopps {
       /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
        Test Data: Java Candır, gerisi heyecandır.
         */
       public static void main(String[] args) {
           String text="Java Candır, gerisi heyecandır.";
           int a=0;

               for (int i = 0; i < text.length(); i++) {
               if (text.toLowerCase().charAt(i)=='a'){
                   a++;
               } else if (text.toLowerCase().charAt(i)=='c') {
                   break;
               }

           }
           System.out.println("a harfi sayısı: "+a);

       }
}
