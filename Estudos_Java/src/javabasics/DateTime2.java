package javabasics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class DateTime2 {
    public static void main (String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); //convertendo horario-dia padrao(londres) para do sistema operacional do pc
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); //convertendo horario-dia padrao londres para o de portugal
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        System.out.println("dia :" + d01.getDayOfMonth());//pegando o dia de uma data
        System.out.println("mês: " + d02.getMonthValue());//pegando o mes de uma data
        System.out.println("ano: " + d01.getYear());//pegando o ano de uma data
    }
}
