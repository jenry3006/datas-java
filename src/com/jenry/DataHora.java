package com.jenry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataHora {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("Dia " + localDateTime.getDayOfMonth());
        System.out.println("Mes " + localDateTime.getMonth());
        System.out.println("Ano " + localDateTime.getYear());
        System.out.println("Hora " + localDateTime.getHour());
        System.out.println("Minuto " + localDateTime.getMinute());
        System.out.println("Segundo " + localDateTime.getSecond());
    }
}
