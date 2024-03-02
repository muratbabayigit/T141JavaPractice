package day02;

public class M04_operators {
    public static void main(String[] args) {
        // = atama operatörü
        int sayi=12;
        System.out.println(sayi);


        // == eşittir operatörü
        int a=12;
        double b=12.0;
        System.out.println(a==b); //true
        System.out.println((int)(b)); //12


        // && (ve) operatörü
        //bu operatörün sağındaki koşulla solundaki koşul gerçekleşmesi beklenir

        System.out.println(2>7 && 13<128); //false  2>7 olmadığını görünce false yapıştırır
        System.out.println(2>7 & 13<128); //false   2>7 olmadığını görür ama false yapıştırmaz gider ikinci koşula da bakar ve yine de false der


        // || (veya) Operatörü

        System.out.println(2<7 || 13>128); //true


        // % modules operatörü
        // operatörün solundaki sayının sağındaki sayıya bölümü sonucunda kalanı verir
        System.out.println(14%3);


    }
}
