package Local;

import java.time.LocalDate;

public class localdata {
    public static void main(String[] args) {
        String data1 = "2025-04-22";

        //LocalDate dia = LocalDate.now(); //este imprime a data de hoje retire o "//" da frente para ver

        LocalDate data1parse = LocalDate.parse(data1);
        LocalDate faraQualIdade = data1parse.plusYears(10);
        LocalDate data = LocalDate.of(1997,04,22);

        String data2 = "2026-11-02";
        LocalDate data2parse = LocalDate.parse(data2);
        System.out.println(faraQualIdade);
        System.out.println(data2parse.isAfter(data1parse));
        System.out.println(data);
    }
}
