package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula002 {
    static void main() {
        LocalDate d04 = LocalDate.parse("2027-09-20");
        LocalDateTime d05 = LocalDateTime.parse("2027-09-20T22:20:23");
        Instant d06 = Instant.parse("2027-09-20T22:20:23Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearsLocalDate = d04.plusYears(7);

        System.out.println("PastWeekLocalDate = "+pastWeekLocalDate);
        System.out.println("NextWeekLocalDate = "+nextWeekLocalDate);
        System.out.println("NextYearsLocalDate = "+nextYearsLocalDate);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),d05);
        System.out.println("t1 dias = "+t1.toDays());
    }
}
