import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        final int NUMERO_DA_CONTA = 12345;
        final int NUMERO_DA_AGENCIA = 237;
        final String NOME_DO_CLIENTE = "Anderson Dantas";
        double saldo_da_conta = 10000.00;

        Scanner scanner = new Scanner(System.in);

        // Solicitar valor para saque
        System.out.println("Digite quanto deseja sacar: ");
        double valor_sacar = scanner.nextDouble();

        if (valor_sacar > 0 && valor_sacar <= saldo_da_conta) {
            saldo_da_conta -= valor_sacar;
            System.out.println("Você sacou: " + valor_sacar);
            System.out.println("Saldo restante: " + saldo_da_conta);
        } else {
            System.out.println("Operação inválida! Verifique o saldo ou o valor informado.");
        }

        // Solicitar valor para transferência
        System.out.println("Digite o valor a ser transferido: ");
        double transferir = scanner.nextDouble();

        if (transferir > 0 && transferir <= saldo_da_conta) {
            saldo_da_conta -= transferir;
            System.out.println("Você transferiu: " + transferir);
            System.out.println("Saldo restante: " + saldo_da_conta);
        } else {
            System.out.println("Operação inválida! Verifique o saldo ou o valor informado.");
        }

        // Consumir quebra de linha pendente após o último nextDouble()
        scanner.nextLine();

        // Solicitar motivo para cancelar a conta
        System.out.println("Quer cancelar a conta? Se sim, digite o motivo:");
        String cancelar = scanner.nextLine();
        System.out.println("O motivo de cancelamento foi: " + cancelar + ", obrigado por usar nosso serviço " +NOME_DO_CLIENTE);

        //aqui esta o mesmo procedimento sem usar condicionais UMA FALHA NA SEGURANÇA DO SISTEMA E NA LOGICA É CLARO
        //É só um exemplo para mostrar como se faz sem condional vc usa direto a variavel
        System.out.println("DIGITE UM VALOR: ");
        double processar = scanner.nextDouble();
        double resultado = saldo_da_conta - processar;

        System.out.println("aqui esta o saldo: "+resultado);


        // Exibir informações adicionais
        double ano2023 = 100.00;
        double ano2024 = 20000.00;
        System.out.println("Valores entre os anos 2024: " + ano2024 + " e ano de 2023: " + ano2023);
        System.out.println("Saldo atual: " + saldo_da_conta + " "+NUMERO_DA_AGENCIA+" "+NUMERO_DA_CONTA+" "+NOME_DO_CLIENTE);

        // Fechar o scanner
        scanner.close();
    }
}
