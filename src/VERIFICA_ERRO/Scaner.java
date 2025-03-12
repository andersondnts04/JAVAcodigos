package trycatch;

import java.math.BigDecimal;
import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite seu nome: ");
        String nome = scanner.next();

        System.out.print("digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.println("Seu nome é: "+nome);
        System.out.println("Sua idade é: "+idade);
        BigDecimal num1 = new BigDecimal(50.00);
        BigDecimal percentual = new BigDecimal(25.00);
        BigDecimal resultado = num1.multiply(percentual).divide(new BigDecimal(100));
        System.out.println(resultado);
    }
}
