package exercises;
import java.time.Duration;
//import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class ExerciseDateTime {
    public static void main (String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20"); //ano, mes, dia
        LocalDateTime d02 = LocalDateTime.parse("2022-07-13T01:30:26");
        //Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7); //tira 7 dias da data
        LocalDate nextWeeklLocalDate = d01.plusDays(7); //adiciona 7 dias
        LocalDate nextYearsLocalDate = d01.plusYears(3);
        System.out.println("Data atual = " + d01);
        System.out.println("semana passada = " + pastWeekLocalDate);
        System.out.println("semana que vem = " + nextWeeklLocalDate);
        System.out.println("daqui 2 anos será = " + nextYearsLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        //Instant nextWeekInstant = d01.plus(7, ChronoUnit.DAYS) //adiciona 7 dias em Instant
        //Instant pastWeekInstant = d01.minus(7, ChronoUnit.DAYS) //retira 7 dias em Instant

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));//convertido
        //Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d02); // funciona com LocalDatetime
        System.out.println("Duration = " + t2.toDaysPart());
        System.out.println("Duration (converted)= " + t1.toDaysPart());
    }

}
