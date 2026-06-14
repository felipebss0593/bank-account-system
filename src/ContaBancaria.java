import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Felipe Fernando";
        String tipoConta = "Corrente";
        double saldoTotal = 2500;
        int opcao = 0;

        System.out.println("********************");
        System.out.println("\nNome do cliente: "+ nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoTotal);
        System.out.println("********************");

        String menu = """
                
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                """;

        while(opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if(opcao == 1) {
                System.out.println("O saldo atual é: " + saldoTotal);
            }else if(opcao == 2) {
                System.out.println("Qual o valor que deseja tranferir: ");
                double valorTranferencia = scanner.nextDouble();
                if (valorTranferencia>saldoTotal) {
                    System.out.println("Saldo insuficiente.");
                }else {
                    saldoTotal -= valorTranferencia;
                    System.out.println("Saldo atualizado para: " + saldoTotal);
                }
            }else if (opcao == 3) {
                System.out.println("Qual o valor que deseja depositar: ");
                double valorDepositar = scanner.nextDouble();
                saldoTotal += valorDepositar;
                System.out.println("Saldo atualizado para: " + saldoTotal);
            }else if (opcao != 4){
                System.out.println("Opção inválida. Tente novamente");
            }

        }

    }
}
