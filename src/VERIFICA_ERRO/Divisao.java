package trycatch;

public class Divisao {
    public static void main(String[] args) {
        try {
            System.out.println("Dividindo");
            System.out.println(1/0);
        }catch (Exception ex){
            System.err.println("Erro na tentaiva de divisão");
        }
    }
}
