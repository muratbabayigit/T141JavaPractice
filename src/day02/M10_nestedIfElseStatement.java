package day02;

import java.util.Scanner;

public class M10_nestedIfElseStatement {
    /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
     * degerini hesaplayin. 45 hiz siniridir.
     * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
     * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
     * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
     * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
     * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
     * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hız Değerini Giriniz: ");
        int velocity= scan.nextInt();
        System.out.println("Ehliyet Var mı?(E/H): ");
        char drvL=scan.next().toUpperCase().charAt(0);

        if (drvL=='E'){
            if (velocity>=55 && velocity<=74){
                System.out.println("Ceza Tutarı: 100$");
            } else if (velocity>=75 && velocity<=84){
                System.out.println("Ceza Tutarı: 150$");
            } else if (velocity>=85 && velocity<=94){
                System.out.println("Ceza Tutarı: 320$");
            }else if(velocity>94) {
                System.out.println("Ceza Tutarı: 500$");
            }else {
                System.out.println("Hız limitini aşmadınız!");
            }
        }else if(drvL=='H'){
            if (velocity>=55 && velocity<=74){
                System.out.println("Ceza Tutarı: 300$");
            } else if (velocity>=75 && velocity<=84){
                System.out.println("Ceza Tutarı: 350$");
            } else if (velocity>=85 && velocity<=94){
                System.out.println("Ceza Tutarı: 520$");
            }else if(velocity>94) {
                System.out.println("Ceza Tutarı: 700$");
            }else {
                System.out.println("Hız limitini aşmadınız!");
            }
        }


    }




}
