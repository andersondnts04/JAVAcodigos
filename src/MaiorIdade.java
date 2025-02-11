import java.time.LocalDate;
import java.time.Period;

public class MaiorIdade {
    public static void main(String[] args){
        LocalDate Nasceu = LocalDate.of(1997,04,22);
        LocalDate Hoje =LocalDate.now();
        int Idade = Period.between(Nasceu,Hoje).getYears();
        boolean MaiorIdade = Idade>=18;
        System.out.println("sua idade é: " +Idade + " anos, é maior de idade? "+(MaiorIdade? "sim" : "não"));
    }
}
