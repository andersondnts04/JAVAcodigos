package TiposWrappers;

import java.time.LocalDate;
import java.time.Period;

public class aniversario {
    public static void main(String[] args){
        LocalDate Nascimento = LocalDate.of(1997,04,22);
        LocalDate Hoje = LocalDate.now();
        int Aniversario = Period.between(Nascimento,Hoje).getYears();
        System.out.println(Aniversario);
    }
}
