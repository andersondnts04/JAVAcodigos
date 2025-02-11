package TiposWrappers;

import java.time.LocalDate;
import java.time.Period;

public class Aniverssariante {
    public static void main(String[]args){
        LocalDate nasceu = LocalDate.of(1997,04, 22);
        LocalDate hoje = LocalDate.now();
        int nascimento = Period.between(nasceu,hoje).getYears();

        System.out.println(nascimento);
    }
}
