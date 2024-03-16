package day04;

public class M03_forLoops {
    public static void main(String[] args) {
        //Soru 1'den 100'e kadar olan sayılardan 3 ile tam bölünenleri yazdırınız

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }

        }
    }
}
