package day01;

public class M02_dataTypes {
    public static void main(String[] args) {

        /*
        PRIMITIVE DATA TURLERINE ORNEK
            byte < short < integer < long < float < double
            byte, short,integer,long sadece tamsayı degeri alır ve
            sırasıyla 8bit,16bit, 32bit[ençok kullanılan]  ve 64bit data saklayabilir

            float ve double ondalıklı sayıları kaydeder

            boolean: mantıksal olarak true/false deger içerir
            char: ASCII karakterler
         */
        byte b=127;
        System.out.println("b2 = " + b);

        byte b1= Byte.MAX_VALUE;
        System.out.println("b1 = " + b1);
        short sh1= Short.MAX_VALUE;
        System.out.println("sh1 = " + sh1);
        int int1=Integer.MAX_VALUE;
        System.out.println("int1 = " + int1);
        long long1=Long.MAX_VALUE;
        System.out.println("long1 = " + long1);
        float fl=Float.MAX_VALUE;
        System.out.println("fl = " + fl);
        double db1=Double.MAX_VALUE;
        System.out.println("db1 = " + db1);

        byte b2= Byte.MIN_VALUE;
        System.out.println("b2 = " + b2);
        short sh2= Short.MIN_VALUE;
        System.out.println("sh2 = " + sh2);
        int int2=Integer.MIN_VALUE;
        System.out.println("int2 = " + int2);
        long long2=Long.MIN_VALUE;
        System.out.println("long2 = " + long2);
        float fl2=Float.MIN_VALUE;
        System.out.println("fl2 = " + fl2);
        double db2=Double.MIN_VALUE;
        System.out.println("db2 = " + db2);

        /*
        NON PRIMITIVE DATA TURLERI
        Çok fazla turu vardır.
        karakter sınırı yoktur
        String bu data turunde en cok kullandigimiz data turudur


         */

        String isim="tarık";
        System.out.println("isim = " + isim); //tarık
        System.out.println("ismin ilk harfi = " + isim.charAt(0));


        int sayi;
        sayi=128;
        System.out.println("sayi = " + sayi);


        isim="Murat";
        System.out.println("isim = " + isim); //Murat
        System.out.println("isim = " + isim.toUpperCase());;
        System.out.println("isim = " + isim.toLowerCase());


        





    }
}
