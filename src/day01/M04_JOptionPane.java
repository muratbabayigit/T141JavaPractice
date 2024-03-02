package day01;

import javax.swing.*;

public class M04_JOptionPane {

    public static void main(String[] args) {
        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */
            //JOptionPane ile alınan verileir String olarak döndürür

        String name= JOptionPane.showInputDialog("Lütfen İsminizi Giriniz");
        String surname=JOptionPane.showInputDialog("Lütfen Soyadınızı Giriniz");
        String ageSTR=JOptionPane.showInputDialog("Lütfen Yaşınızı Giriniz");
        int age=Integer.parseInt(ageSTR); // Bir önceki satırda girilen değer sayısal işlemde kullanılancaksa Parsing yapılmalıdır
        String mail=JOptionPane.showInputDialog("Lütfen Mail Adresinizi Giriniz");
        String pass=JOptionPane.showInputDialog("Lütfen Şifrenizi Giriniz");







        JOptionPane.showMessageDialog(null," *****       KAYIT BAŞARILI      *****\n"+
                                        "Adınız: "+name+"\n"+"Soyadınız: "+surname+"\n"+
                                        "Yaşınız: "+age+"\n"+"Mail Adresiniz: "+mail+
                                        "\n"+"Şifreniz: "+pass+"\nşeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");





    }

}
