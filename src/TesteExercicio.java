import java.util.Scanner;

public class TesteExercicio {
    public static void main(String [] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escreva seu nome: ");
        String nome = scanner1.nextLine();

        System.out.println("digite sua idade: ");
        int idade = scanner1.nextInt();
        scanner1.close();
        System.out.println("Olá " + nome +" e sua idade é " + idade +" anos.");
    }
}
