package javabasics;

import java.util.Scanner;
import java.util.Locale;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        LocalDate date = LocalDate.now(); //data atual 
        LocalDateTime time = LocalDateTime.now(); //data-hora atual
        Instant dateLondres = Instant.now(); //data-hora de londres

        LocalDate date2 = LocalDate.parse("2022-07-20");
        LocalDateTime date3 = LocalDateTime.parse("2022-07-20T15:30:22"); //formatacao ISO
        Instant date4 = Instant.parse("2022-07-20T15:30:22Z");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate dateFmt = LocalDate.parse("20/10/2000", fmt);
        LocalDateTime dateFmt2 = LocalDateTime.parse("20/10/2000 01:30", fmt2);

        LocalDate dateFmt3 = LocalDate.of(2002, 10, 29);
        LocalDateTime dateFmt4 = LocalDateTime.of(2002, 7, 20, 1, 30);

        DateTimeFormatter dateFmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("formatadoComPattern: " + date2.format(dateFmt5));

        DateTimeFormatter dateFmt6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //pega o fuso horario registrado no sistema do usuario


        System.out.println("dia: " + date + "\nDia + horario  :" + time + "\nDia-hora em londres: " + dateLondres);
        System.out.println("Dia Manuscrito: " + date2);
        System.out.println("Dia ManuscritoTime: " + date3);
        System.out.println("Dia ManuscritoTime(padrao londres): " + date4);
        System.out.println("DiaFormatado: " + dateFmt);
        System.out.println("DiaFormatado2: " + dateFmt2);
        System.out.println("DiaFormatado3: " + dateFmt3);
        System.out.println("DiaFormatado4: " + dateFmt4);
        System.out.println("formatadoComPattern: " + date2.format(dateFmt5));
        System.out.println("datefmt6 : " + dateFmt6.format(date4));

        sc.close();
    }
}
