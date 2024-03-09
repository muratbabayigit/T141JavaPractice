package day03;

import java.util.Scanner;

public class M06_switchStatements {
    public static void main(String[] args) {
         /*
        Kullanicidan ay numarasini alip mevsimi yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Bulunduğunuz ay kaçıncı ay: ");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1: case 2: case 12: System.out.println("Kış Mevsimindesiniz"); break;
            case 3: case 4: case 5: System.out.println("İlkbahar Mevsimindesiniz"); break;
            case 6: case 7: case 8: System.out.println("Yaz Mevsimindesiniz"); break;
            case 9: case 10: case 11: System.out.println("Sonbahar Mevsimindesiniz"); break;
            default:System.out.println("Yanlış bir değer giridğiniz 1-12 arası girmelisiniz");
        }


    }
}
