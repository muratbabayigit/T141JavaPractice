package day03;

import java.util.Scanner;

public class M07_substring {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız!");
        String cumle= scan.nextLine();
        if (cumle !=""){
            System.out.println(cumle.contains(" "));

        }else{
            System.out.println("herhangi bir değer girilmedi");
        }


    }
}
