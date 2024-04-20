package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M06_List {
    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {
        List<Double> not=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.print("Not girişi için E tuşuna basınız: ");
        char devam=scan.next().charAt(0);
        double toplam=0;

        while(devam=='E'|| devam=='e'){
            System.out.print("Not Girişi: ");
            not.add(scan.nextDouble());
            System.out.print("Yeni not girmek için E tuşuna, not girişini sonlandırmak için herhangi bir tuşa basınız: ");
            devam=scan.next().charAt(0);
        }
        System.out.println("Sisteme girilen notlar:"+not);

        for (int i = 0; i < not.size(); i++) {
            toplam+=not.get(i);
        }
        double ortalama=toplam/not.size();
        System.out.println("Sınıf Ortalaması: "+(ortalama));

        List<Double> ortGecen=new ArrayList<>();
        for (double a:not) {
            if(a>ortalama){
                ortGecen.add(a);
            }

        }
        System.out.println("Ortalamayı Geçen Öğrenci Sayısı: "+ortGecen.size());

    }
}
