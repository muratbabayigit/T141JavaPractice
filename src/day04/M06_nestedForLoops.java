package day04;

public class M06_nestedForLoops {
    /*
 Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *

           şeklini konsola yazdiriniz.
 */
    public static void main(String[] args) {
        int boyut=5; //Baklavanın çapını belirledik
        //i satır j ve k sütun ifade eder
        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=boyut-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Buraya kadar baklavanın yarısını yazdık
        for (int i = boyut-1; i >=1 ; i--) {

            for (int j = 1; j <=boyut-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }



}
