import java.math.BigDecimal;

public class Objeto {
       private String nome;
       private int idade;
       private BigDecimal Saldo;

    public void setnome(String newnome){
        this.nome = newnome;
    }
    public String getnome(){
        return this.nome;
    }
    public static void main(String[] args){
        Objeto cliente = new Objeto();
        cliente.setnome("josé");
        System.out.println(cliente.getnome());

    }
}
