package day05;

import java.util.Scanner;

public class M04_whileLoop {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scan.next();
        int sayac = 0;

        while (sayac <= kelime.length()-1) {
            if (sayac %2 == 1){
                System.out.println(sayac+".indexteki harf: "+kelime.charAt(sayac));
            }
            sayac++;
        }
    }
}
