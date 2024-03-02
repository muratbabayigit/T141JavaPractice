package day02;

public class M03_IncrementDeIncrement {
    public static void main(String[] args) {

        int a=101;
        System.out.println("Dosya Numarası: "+a);
        //bir sonraki dosya numarası bir öncekinin 5 fazlası olsun
        a+=5; //Bu işlem a'nın değerini 5 arttırıp yeniden a'ya atar
        // a= a+5 ile a+=5 aynı şeydir
        System.out.println("Dosya Numarası: "+a);
        a+=5;System.out.println("Dosya Numarası: "+a);
        //Dosya Numarası birer birer artsın
        //a+=1;
        a++;//112
        System.out.println("Dosya Numarası: "+a);

        System.out.println("Dosya Numarası: "+a);

        a--;
        System.out.println("Dosya Numarası: "+a); //111
        a-=11;
        System.out.println("Dosya Numarası: "+a); //100
        a*=5;
        System.out.println("Dosya Numarası: "+a); //500
        a/=2;
        System.out.println("Dosya Numarası: "+a); //250





    }
}
