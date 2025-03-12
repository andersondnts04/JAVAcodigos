package treino;

public class SetTeste01 {
    public static void main(String[] args) {
        Teste01 cliente = new Teste01();
       cliente.setIdade(27);
       cliente.setNome("Anderoso o maior");
       System.out.println(cliente.getIdade());
       System.out.println(cliente.getNome());

    }
}
