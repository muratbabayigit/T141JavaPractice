package day08.okulYonetim;

import java.awt.*;
import java.util.Scanner;

public class AnaMenu {

    /*
    ====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ

     */
    void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.print("====================================\n\tÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n====================================\n" +
                "\t\t1- ÖĞRENCİ İŞLEMLERİ\n\t\t2- ÖĞRETMEN İŞLEMLERİ\n\t\tQ- ÇIKIŞ\n\n\nSeçiminizi Yapınız: ");
        char secim=scan.next().toUpperCase().charAt(0);

        switch (secim){

            case '1':
                OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
                ogrenciIslemleri.ogrenciIslemleri();
                break;
            case '2':
                //Öğretmen işlemleri mensüne gitsin
                break;
            case 'Q':
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış Giriş Yaptınız Sistemden Çıkılıyor..........");

        }
    }
}
