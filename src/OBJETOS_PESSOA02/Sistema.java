package orientacaoAobjetos05;

public class Sistema {
    public static void main(String[] args) {
        DaAula Gleyson = new DaAula();
        Gleyson.nome=("Gleyson Sampaio");
        System.out.println(Gleyson.nome);
        System.out.println(Gleyson.LimiteCredito);
        Gleyson.SolicitarCredito(200.0);
        System.out.println(Gleyson.LimiteCredito);
    }
}
