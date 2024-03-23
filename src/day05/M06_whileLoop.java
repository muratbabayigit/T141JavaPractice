package day05;

import java.util.Scanner;

public class M06_whileLoop {
    // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve
    // bolme operatoru kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz

    static int bolum=0; //Tüm clasta kullanmak için class level da tanımladık

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bölünecek Sayıyı Giriniz: ");
        int bolunen= scan.nextInt();
        System.out.print("Bölecek Sayıyı Giriniz: ");
        int bolen= scan.nextInt();

        System.out.println("Sonuc: "+bol(bolunen,bolen));
    }

    public static int bol(int bolunen, int bolen) {
        while(bolunen>=bolen){
            bolunen-=bolen;
            bolum++;
        }
        return bolum;
    }
}
