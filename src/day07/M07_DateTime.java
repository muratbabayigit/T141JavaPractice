package day07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class M07_DateTime {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        System.out.println("==============================================");


        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ss.SSSS");
        String formattedDateTime= now.format(formatter);
        System.out.println("Şu an: "+formattedDateTime);

    }
}
