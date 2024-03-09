package day03;

import java.util.Scanner;

public class M08_Substring {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadını 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı arada bir boşluk olacak şekilde giriniz: ");
        String nameSurname= scan.nextLine();

        String name=nameSurname.substring(0,nameSurname.indexOf(" ")+1);
        String surname=nameSurname.substring(nameSurname.indexOf(" "));
        System.out.println("İsminiz: "+name+"\nSoyisiminiz:"+surname);

    }
}
