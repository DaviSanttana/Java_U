package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Aula001 {

    static void main() {

        DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2027-09-20");
        LocalDateTime d05 = LocalDateTime.parse("2027-09-20T22:20:23");
        Instant d06 = Instant.parse("2027-09-20T22:20:23Z");
        Instant d07 = Instant.parse("2027-09-20T22:20:23-03:00");

        LocalDate d08 = LocalDate.parse("23/09/2026", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("23/09/2026 01:30", fmt2);


        System.out.println("D01 = "+d01);
        System.out.println("D02 = "+d02);
        System.out.println("D03 = "+d03);
        System.out.println("D04 = "+d04);
        System.out.println("D05 = "+d05);
        System.out.println("D06 = "+d06);
        System.out.println("D07 = "+d07);
        System.out.println("D08 = "+d08);
        System.out.println("D09 = "+d09);

    }



}
