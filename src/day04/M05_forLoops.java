package day04;

import java.util.Scanner;

public class M05_forLoops {
    public static void main(String[] args) {
            /* TASK :
        Kullanıcıdan 10 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Lütfen "+i+" . sayıyı giriniz: ");
            int number= scan.nextInt();
            if (number>=5 && number<=10){
                continue; // bu koşul gerçekleşince işlem yapmadan devam etmeyi sağlar
            }
            toplam+=number;
        }
        System.out.println("Sayıların toplamı: "+toplam);


    }
}
