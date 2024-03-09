package day02;

import java.util.Scanner;

public class M09_ifElseStatement {
    public static void main(String[] args) {
        /*
        Interview :
        Kullanıcıdan bir yıl  girmesini isteyin. Yılın artık yıl olup olmadığını kontrol edin.
        Kullanıcya da sonucu ifade edin.
        İpucu:
        Bir yılın sayısı eğer 100 ve 400 ile tam  bölünüyorsa artık yıldır
        Bir yılın sayısı eğer  100'e bölünmüyor ama 4'e tam bölünüyorsa o da artık yıldır.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen kontrol etmek istediğiniz yılı yazınız: ");
        int year= scan.nextInt();

        if (year%100==0 && year%400==0){
            System.out.println("Girdiğiniz "+year+" yılı ARTIK YILDIR ve 366 gündür.");
        } else if (year%100!=0 && year%4==0) {
            System.out.println("Girdiğiniz "+year+" yılı ARTIK YILDIR ve 366 gündür.");
        }else {
            System.out.println("Girdiğiniz "+year+" yılı ARTIK YIL DEĞİLDİR ve 365 gündür.");
        }
    }
}
