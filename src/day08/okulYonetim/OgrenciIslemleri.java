package day08.okulYonetim;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemleri implements I_islemler{
    /*
    	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKIŞ

	SEÇİMİNİZ:
     */
    Scanner scan=new Scanner(System.in);
    List<Ogrenci> ogrenciList=new ArrayList<>();
    int ogrenciNo=1000;




    void ogrenciIslemleri(){
        System.out.print("============= İŞLEMLER =============\n\t1-EKLEME" +
                           "\n\t2-ARAMA\n\t3-LİSTELEME\n\t4-SİLME\n\t5-ANA MENÜ\n\tQ-ÇIKIŞ\n\n\nSeçiminiz: ");
        char secim=scan.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':ekleme(); break;
            case '2':arama(); break;
            case '3':listeleme();break;
            case '4':silme();break;
            case '5':anaMenu();break;
            case 'Q':cikis();break;
            default:
                System.out.println("Yanlış giriş yaptınız");
        }

    }


    @Override
    public void ekleme() {
        System.out.println("===============================================");
        System.out.println("       YENİ ÖĞRENCİ BİLGİ GİRİŞ EKRANI          ");
        System.out.println("===============================================");
        scan.nextLine();
        System.out.print("Öğrenci Adı: ");
        String ad= scan.nextLine();
        System.out.print("Öğrenci Soyadı: ");
        String soyad= scan.nextLine();
        System.out.print("Öğrenci TCKN: ");
        String tcNumber= scan.nextLine();
        System.out.print("Öğrenci Yaşı: ");
        int yas= scan.nextInt();
        System.out.print("Öğrenci Sınıfı: ");
        int sinif= scan.nextInt();
        Ogrenci ogrenci=new Ogrenci(ad,soyad,tcNumber,yas,ogrenciNo++,sinif);
        ogrenciList.add(ogrenci);
        System.out.println(" ");
        System.out.println("İşlem başarıyla tamamlanmıştır.\n");
        listeleme();
        ogrenciIslemleri();
    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.print("Aranan TCKN: ");
        String tcNumber= scan.next();

        for (Ogrenci each:ogrenciList) {
            if (each.getTcNumber().contains(tcNumber)){
                System.out.println("Girdiğiniz "+tcNumber+" numaralı kişi sistemlerimizde aşağıdaki bilgilerle kayıtlıdır.");
                System.out.println(each);
                ogrenciIslemleri();
            }else{
                System.out.println("Sistemlerimizde "+tcNumber+" numaralı bir kayıt yoktur");

            }
            
        }


    }

    @Override
    public void listeleme() {
        System.out.println("Sistemde kayıtlı kişiler :");
        for (Ogrenci each:ogrenciList) {
            System.out.println(each);

        }
        ogrenciIslemleri();

    }

    @Override
    public void silme() {
        System.out.print("Silinecek TCKN: ");
        String tcNumber= scan.next();
        boolean flag=true;

        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNumber().equals(tcNumber)){
                System.out.println("Girdiğiniz "+tcNumber+" numaralı kişi ağaıdaki bilgilieriyle birlikte silinecek");
                System.out.println(ogrenciList.get(i));
                ogrenciList.remove(i);
                flag=false;
                listeleme();
            }
            if (flag){
                System.out.println("Kayıtlarımızda "+tcNumber+" numaralı bir kayıt yoktur");
            }

        }


    }

    @Override
    public void anaMenu() {
        AnaMenu anaMenu=new AnaMenu();
        anaMenu.menu();
    }

    @Override
    public void cikis() {
        System.exit(0);

    }
}
