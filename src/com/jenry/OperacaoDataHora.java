package com.jenry;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class OperacaoDataHora {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.parse("2022-04-06");
        System.out.println("Hoje " + hoje);

        LocalDate amanha = hoje.plus(1, ChronoUnit.DAYS);
        System.out.println("Amanhã: " + amanha);

        LocalDate ontem = hoje.minus(1, ChronoUnit.DAYS);
        System.out.println("Ontem " + ontem);

        System.out.println("Amanhã é depois de hoje?" + amanha.isAfter(hoje));
        System.out.println("Ontem é depois de hoje?" + ontem.isBefore(hoje));
        System.out.println("Hoje é depois de ontem?" + hoje.isAfter(ontem));
        System.out.println("Amanha é antes de ontem?" + amanha.isBefore(ontem));

    }
}
