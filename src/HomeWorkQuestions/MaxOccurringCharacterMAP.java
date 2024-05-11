package HomeWorkQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
//Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.(Ignore case sensitivity)
//Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
//Input : Learning java is easy
//output: maximumCounts occurring character is : a
 */
public class MaxOccurringCharacterMAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz:");
        String input = scanner.nextLine();

        // Küçük harfe dönüştürerek işlem yapacağız
        input = input.toLowerCase();

        // Karakter sayılarını tutacak hashmap
        Map<Character, Integer> charCounts = new HashMap<>();

        // Her karakterin sayısını hesapla
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Sadece harf karakterlerini say
                if (charCounts.containsKey(c)) {
                    charCounts.put(c, charCounts.get(c) + 1);
                } else {
                    charCounts.put(c, 1);
                }
            }
        }

        // En çok tekrar eden karakteri bul
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Sonucu yazdır
        System.out.println("En çok tekrar eden karakter: " + maxChar);
        System.out.println("Tekrar sayısı: " + maxCount);

        scanner.close();
    }
}
