package day04;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class M02_StringManipulation {
    public static void main(String[] args) {
      /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

        	 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

      Scanner scan=new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("İsminiz: ");
        String name= scan.nextLine();
        System.out.print("Soyisminiz: ");
        String surname= scan.nextLine();
        System.out.print("Arada boşluk bırakmadadan 16 haneli kredi kartı numaranızı giriniz: ");
        String creditCard= scan.nextLine();
        name=name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w","*");
        surname=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*");

        if (creditCard.length()>16 || creditCard.length()<16){
            System.out.println("Geçersiz Kredi Kartı Numarası Girdiniz");
        }else{
            System.out.print("Adı :"+name+" ");
            System.out.print("Soyadı :"+surname+" ");
            System.out.print("kredi Kartı No:"+creditCard.substring(0,13).replaceAll("\\w","*")+creditCard.substring(12));

        }





    }
}
