package TiposWrappers;

import java.time.LocalDate;
import java.time.Period;

public class atribuicoes {
    public static void main(String[] args){
        String nome = "Anderson "+"Dantas";
        String Filiacao = "Fabiana ".concat("Angelica");
        int n1 = 10;
        int n2 = 20;
        //vc pode somar da seguinte maneira
        n1=n1+n2;
        //ou pode usar para abreviar: n1+=n2;
        //tambem pode criar uma variavel só para soma, mas nem sempre é necessario
        LocalDate nasceu = LocalDate.of(1997, 04,22);
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(nasceu, hoje).getYears();
        System.out.println(nome);
        System.out.println(Filiacao);
        System.out.println(n1);

        System.out.println("Sua idade é: "+idade);
    }
}
