package day01;


public class M01_helloWorld {
    public static void main(String[] args) {

 //      System.out.println("Hello World");
 //      System.out.println("Merhaba Dünya");
 //      System.out.print("Merhaba 141");
 //      System.out.println(" Java Dünyasına hoş geldiniz" );
 //      System.out.println("Merhaba"                    +                                          " Team141");
 //      System.out.println("Merhaba                                                                  Team141");
 //      System.out.println("\tSayın Yetkili");
 //      System.out.println("Firmanıza yapmış olduğum.....");


        //javada tek satırlık yorum yazmak için iki // işareti yanyana yazılır

        /*
        Bu şekilde yapılan yorumlar
        aynı satırda olmak zorunda değildir.
        birden fazla satır y0rum yapacaksak bu yöntemi kullanmalıyız
         */

        /*
         Soru - 1
        Konsola
        Hello World ve "Hello World"
        yazdırınız.
         */
        // bir System.out.println ile " işaretini yazdırmak için \" bu işaret kullanılır
        System.out.println("Hello World ve \"Hello World\" ");
        System.out.println("Wise Quarter \nHave Nice Day!");

        /*
        \" : metin içinde çift tınak işareti koyar
        \t :bulunduğu noktadan bir TAB boşluk bırakır
        \n :Bulunduğu noktadan itibaren metni al satıra kaydırır
        \' :metin içinde tek tınak işareti koyar
        \\ :metin içinde \ işareti koyar


         */

        /*
         Soru -2
        Değer atayarak aşağıdak ki metni tek bir System.out.println içinde yazdırın
      1.Metin  Tarık Yiğit - QA Software Test Engineer
      2.Metin  Tarık Yiğit
               QA Software Test Engineer
         */

        String name="Tarık";
        String surname="Yiğit";
        String job= "QA Software Test Engineer";

        System.out.println(name+" "+surname+" - "+job);
        System.out.println(name+" "+surname+"\n"+job);

        /*
        JavaOgrenmekNeGuzel   javaOgrenmekNeGuzel: camel Case
        JaVaOgReNMeK: kebap Case



         */






    }


}
