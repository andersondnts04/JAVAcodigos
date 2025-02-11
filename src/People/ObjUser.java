package People;

import Alunos_escola.Aluno;

public class ObjUser {
    private String nome;
    private int idade;
    public int numero = 5;
    public int numero2 = 10;
    public int novonum;

    public void somar() {
        if (numero > 0) {
            this.novonum = numero + numero2;
        }
    }

    // Getter para 'novonum'
    public int getNovonum() {
        return novonum;
    }

    // Getter e setter para 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    // Getter e setter para 'idade' com validação
    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade > 0) {
            this.idade = novaIdade;
        } else {
            System.out.println("Erro: A idade precisa ser maior que zero.");
        }
    }

    public static void main(String[] args) {
        ObjUser usuario = new ObjUser();
        usuario.setNome("Juscelino Kubitschek");
        usuario.setIdade(30); // Definindo idade válida
        usuario.somar();

        System.out.println(usuario.getNovonum() + " " + usuario.getNome() + " -> " + usuario.getIdade() + " ANOS");
    }
}
