package day03;

public class M10_Substring {
      /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= 13.99
        String str 2= 10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
      public static void main(String[] args) {

          String str1= "%13.99";
          String str2= "%10.55" ;

          str2=str2.substring(1);
          str1=str1.substring(1);

          double dbl1=Double.parseDouble(str1);
          double dbl2=Double.parseDouble(str2);
          System.out.println("Sayılar Toplamı = " + (dbl1+dbl2));



      }
}
