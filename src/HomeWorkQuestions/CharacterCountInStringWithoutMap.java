package HomeWorkQuestions;

import java.util.Scanner;

public class CharacterCountInStringWithoutMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz:");
        String input = scanner.nextLine();

        // Her karakterin sayısını tutacak dizi (ASCII değerlerine göre)
        int[] charCounts = new int[256]; // ASCII karakterler için genişletilmiş boyut

        // Her bir karakterin sayısını hesapla
        for (char c : input.toCharArray()) {
            // Sadece harf veya rakam karakterlerini say
            if (Character.isLetterOrDigit(c)) {
                char lowerC = Character.toLowerCase(c); // Küçük harfe dönüştür
                charCounts[lowerC]++; // Karakterin ASCII değeri dizinin indisini belirler
            }
        }

        // Sonucu istenilen formatta yazdır
        System.out.print("{ ");
        for (char c = 'a'; c <= 'z'; c++) {
            if (charCounts[c] > 0) {
                System.out.print(c + "=" + charCounts[c] + ", ");
            }
        }
        System.out.println("}");

        scanner.close();
    }
}

