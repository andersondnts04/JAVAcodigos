package Alunos_escola;

public class Aluno {
    private String nome;
    private int idade;
    public String getnome(){
        return nome;
    }
    public void setnome(String newname) {
        this.nome = newname;
    }//newname ou newnome ou new qualquer coisa pode ser o nome desse parametro new
    public int getidade() {
        return idade;
    }
    public void setidade(int newidade) {
        if(newidade <0||newidade>130)
            throw new IllegalArgumentException("A idade precisa ser maior que zero!");
        this.idade = newidade;
    }
}
