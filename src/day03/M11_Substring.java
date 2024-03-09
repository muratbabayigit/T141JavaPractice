package day03;

import java.util.Scanner;

public class M11_Substring {
    /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mail adreisinizi giriniz: ");
        String email= scan.next();

        if (email.contains("hotmail")){
            email=email.replaceAll("hotmail","gmail");

        }
        System.out.println("Mail adresiniz: " +email);


    }
}
