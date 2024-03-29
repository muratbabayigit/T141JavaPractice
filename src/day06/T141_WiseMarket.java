package day06;

import java.util.Scanner;

public class T141_WiseMarket {
   static Scanner scan=new Scanner(System.in);
   static boolean ekUrun=false;
   static int urunKodu;
   static  String urunAd;
   static int urunFiyat;
   static int urunAdedi;

/*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
   6-Alışveriş bitince fiş yazdırsın.
   7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/

    public static void main(String[] args) {girisEkrani();}

        public static void girisEkrani() {
        System.out.println("------- T141 WISE MARKET ------- ");
        System.out.println("     ==== HOŞGELDİNİZ ====       ");
        System.out.println("Lütfen alışveriş yapacağınız reyonu seçiniz!");
        System.out.println("\t1-Şarküteri Reyonu\n\t2-Manav Reyonu\n\t3-Market Reyonu\n\t4-Fiş Yazdırma\n\t5-Çıkış");
        System.out.print("Seçiminiz: ");
        int secim=scan.nextInt();

        if(!(secim>=1 && secim<=5)){
            System.out.println("Geçersiz bir tuşa bastınız");
            girisEkrani();
        }else{
            switch (secim){
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:


                }
            }
        }

    private static void sarkuteri() {
        System.out.println("---- Şarküteri Reyonuna Hoşgeldiniz ----");
        System.out.println("Lütfen almak istediğiniz ürünü seçiniz");
        System.out.println("\t101-Peynir   250₺\n\t102-Tereyağ   500₺\n\t103-Yoğurt   30₺\n\t104-Sucuk   320₺\n\t105-Yumurta   95₺");
        while(!ekUrun){
            System.out.print("Ürün Kodu: ");
            urunKodu= scan.nextInt();
            if(!(urunKodu>=101 && urunKodu<=105)){
                System.out.println("Yanlış bir kod girdiniz. Tekrar Deneyiniz");
                sarkuteri();
            }else if(urunKodu>=101 && urunKodu<=105) {
                System.out.print("Kaç Paket alacaksınız?: ");
                urunAdedi=scan.nextInt();

                switch (urunKodu){
                    case 101:
                        urunAd="Peynir";
                        urunFiyat=250;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 102:
                        urunAd="Tereayağ";
                        urunFiyat=500;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 103:
                        urunAd="Yoğurt";
                        urunFiyat=30;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 104:
                        urunAd="Sucuk";
                        urunFiyat=320;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 105:
                        urunAd="Yumurta";
                        urunFiyat=95;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;




                }

            }






        }


    }

    private static void manav() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");
    }

    private static void market() {
        System.out.println("Market Reyonuna Hoşgeldiniz");
    }

    private static void fisYazdir() {
        System.out.println("Fiş yazdırma ekranına yönlendiriliyorsunuz");
    }

    private static void cikis() {
        System.out.println("Çıkış Yapılıyor");
        System.exit(0);
    }


}
