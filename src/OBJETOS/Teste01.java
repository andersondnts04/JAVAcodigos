package treino;

public class Teste01 {
    private int idade;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int novoidade) {
        this.idade = novoidade;
    }

    public static void main(String[] args) {
        Teste01 cliente = new Teste01();
        cliente.setIdade(27);
        System.out.println(cliente.getIdade());
    }
}
