package day05;

public class M03_methodCreation {
    //Soru: Bir metod oluşturun ve bu metod bir string ve bir sayı alıp,
    // string'i belirtilen sayı kadar tekrar etsin ve sonucu döndürsün.

    public static String repeatText(String text, int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            result.append(text);

        }

        return result.toString();
    }

    public static void main(String[] args) {
        String metin = "Wise";
        int sayi=365;

        System.out.println("Girilen metnin "+sayi+" kez tekrarı: "+repeatText(metin,sayi));

    }

}
