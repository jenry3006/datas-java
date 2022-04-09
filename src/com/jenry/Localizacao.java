package com.jenry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Localizacao {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter localDateTimeFormater
                = DateTimeFormatter.ofPattern("dd/MMMM/YYYY", new Locale("PT","br"));

        System.out.println("Data Formatada BR: " + localDateTime.format(localDateTimeFormater));

        DateTimeFormatter dateTimeFormatterUS = DateTimeFormatter.ofPattern("dd EEEE MMM yyyy", Locale.US);
        System.out.println("Data formatada USA: " + localDateTime.format(dateTimeFormatterUS));

        DateTimeFormatter dateTimeFormatterJP = DateTimeFormatter.ofPattern("dd EEEE MMM yyyy", Locale.JAPAN);
        System.out.println("Data formatada Japão: " + localDateTime.format(dateTimeFormatterJP));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTimePR = ZonedDateTime.now(ZoneId.of("America/La_Paz"));
        System.out.println(zonedDateTimePR);

        LocalDateTime dataHoraReuniao = LocalDateTime.parse("2022-04-06T10:45:10");
        System.out.println("Data e Hora da reunião" + dataHoraReuniao);
    }
}
