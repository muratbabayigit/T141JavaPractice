package HomeWorkQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountInStringMAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz:");
        String input = scanner.nextLine();

        // Her karakterin sayısını tutacak HashMap
        Map<Character, Integer> charCounts = new HashMap<>();

        // Her bir karakterin sayısını hesapla
        for (char c : input.toCharArray()) {
            // Sadece harf veya rakam karakterlerini say
            if (Character.isLetterOrDigit(c)) {
                char lowerC = Character.toLowerCase(c); // Küçük harfe dönüştür
                if (charCounts.containsKey(lowerC)) {
                    charCounts.put(lowerC, charCounts.get(lowerC) + 1);
                } else {
                    charCounts.put(lowerC, 1);
                }
            }
        }

        // Sonucu istenilen formatta yazdır
        System.out.print("{ ");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }
        System.out.println("}");

        scanner.close();
    }
}

