package controle_de_fluxo;

public class AtribTernaria {
    public static void main(String[] args){
     int nota = 7;
     String ternaria= nota>=7? "Aprovado" : nota>=5 && nota<7?"Recuperação" : "Reprovado";
    System.out.println("Situação do aluno? "+ternaria);
    }
}
