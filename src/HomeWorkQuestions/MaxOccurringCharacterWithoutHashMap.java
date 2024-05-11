package HomeWorkQuestions;

import java.util.Scanner;
/*
//Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.(Ignore case sensitivity)
//Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
//Input : Learning java is easy
//output: maximumCounts occurring character is : a
 */

import java.util.Scanner;

public class MaxOccurringCharacterWithoutHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz:");
        String input = scanner.nextLine();

        // Küçük harfe dönüştürerek işlem yapacağız
        input = input.toLowerCase();

        // Her karakterin tekrar sayısını tutacak bir dizi oluştur
        int[] charCounts = new int[256]; // ASCII karakterler için genişletilmiş boyut

        // Her bir karakterin tekrar sayısını hesapla
        for (char c : input.toCharArray()) {
            // Sadece ASCII karakterleri say (0-255 arası)
            if (c >= 0 && c <= 255) {
                charCounts[c]++;
            }
        }

        // En çok tekrar eden karakteri bul
        char maxChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                maxChar = (char) i; // ASCII değeri karaktere dönüştür
            }
        }

        // Sonucu yazdır
        System.out.println("En çok tekrar eden karakter: " + maxChar);
        System.out.println("Tekrar sayısı: " + maxCount);

        scanner.close();
    }
}
