package Alunos_escola;

public class Objetos_Aluno {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setnome("Juscelino Kubscheck");
        felipe.setidade(40);

        System.out.println(felipe.getnome()+" -> "+ felipe.getidade()+" ANO");
    }

}
