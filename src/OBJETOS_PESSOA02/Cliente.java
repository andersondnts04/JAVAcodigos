package orientacaoAobjetos05;

public class Cliente {
    String nome;
    Double LimiteCredito;
    Double ValorDoProduto;
    public void setLimiteCredito(Double ValorSolicitado){
        LimiteCredito = ValorSolicitado;
    }
    public void comprar(Double ValorDoProduto){
        if(ValorDoProduto<=LimiteCredito){
       LimiteCredito -= ValorDoProduto;
            System.out.println("compra efetuada"+ValorDoProduto);
        }else{
            System.out.println("compra negada");
        }
    }

    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setLimiteCredito(500.0);
        System.out.println("esolha um limite de credito "+pedro.LimiteCredito);
        pedro.comprar(200.0);
        System.out.println("seu novo saldo de credito: "+pedro.LimiteCredito);
    }

}
