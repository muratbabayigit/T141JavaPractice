package day03;

import java.util.Scanner;

public class M05_switchStatements {
    public static void main(String[] args) {
        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Üç basmaklı bir sayı giriniz: ");
        int input= scan.nextInt();

        int birlerBasamagi=(input%10), onlarBasamagi=(input/10)%10, yuzlerbasamagi=(input/100);

        switch (yuzlerbasamagi){
            case 0: System.out.print("");break;
            case 1: System.out.print("Yüz");break;
            case 2: System.out.print("İkiyüz");break;
            case 3: System.out.print("Üçyüz");break;
            case 4: System.out.print("Dörtyüz");break;
            case 5: System.out.print("Beşyüz");break;
            case 6: System.out.print("Altıyüz");break;
            case 7: System.out.print("Yediyüz");break;
            case 8: System.out.print("Sekizyüz");break;
            case 9: System.out.print("Dokuzyüz");break;
            default: System.out.print("yanlış giriş yaptınız.");

        }switch (onlarBasamagi){
            case 0: System.out.print("");break;
            case 1: System.out.print("on");break;
            case 2: System.out.print("yirmi");break;
            case 3: System.out.print("otuz");break;
            case 4: System.out.print("kırk");break;
            case 5: System.out.print("elli");break;
            case 6: System.out.print("altmış");break;
            case 7: System.out.print("yetmiş");break;
            case 8: System.out.print("seksen");break;
            case 9: System.out.print("doksan");break;
            default: System.out.print("yanlış giriş yaptınız.");
        }
        switch (birlerBasamagi){
            case 0: System.out.print("");break;
            case 1: System.out.print("bir");break;
            case 2: System.out.print("iki");break;
            case 3: System.out.print("üç");break;
            case 4: System.out.print("dört");break;
            case 5: System.out.print("beş");break;
            case 6: System.out.print("altı");break;
            case 7: System.out.print("yedi");break;
            case 8: System.out.print("sekiz");break;
            case 9: System.out.print("dokuz");break;
            default: System.out.print("yanlış giriş yaptınız.");
        }
    }
}
