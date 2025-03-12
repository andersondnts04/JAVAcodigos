package orientacaoAobjetos05;

public class DaAula {
        String nome;
        Double LimiteCredito;
        public void SolicitarCredito(Double ValorSolicitado){
            LimiteCredito = ValorSolicitado;
        }
        public void comprar(Double ValorDoProduto){
            LimiteCredito = LimiteCredito - ValorDoProduto;
        }
}
