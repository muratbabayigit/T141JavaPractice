package day07;

public class M04_Constructor {
    /*
    Bir müşteri sınıfı oluşturduk. Müşterinin özelliklerini oluşturalım

     */

    String name;
    String surName;
    String email;
    String phoneNumber;

    public M04_Constructor() {
        name="Bilinmiyor";
        surName="Bilinmiyor";
        email="Bilinmiyor";
        phoneNumber="Bilinmiyor";

    }

    public M04_Constructor(String name, String surName, String email, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void bilgileriYazdir(){
        System.out.println("Müşteri Bilgileri");
        System.out.println("Adı: "+name);
        System.out.println("Soyadı: "+surName);
        System.out.println("Email: "+email);
        System.out.println("Telefon: "+phoneNumber);
    }

    public static void main(String[] args) {
        M04_Constructor musteri1=new M04_Constructor();
        musteri1.bilgileriYazdir();
        System.out.println("==============================================");

        M04_Constructor musteri2=new M04_Constructor("Ahmet","Bulut","ahmet@wise.com","+905322222223");
                musteri2.bilgileriYazdir();
    }
}
