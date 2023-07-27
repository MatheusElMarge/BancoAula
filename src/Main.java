import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, bem vindo\nInsira seu nome>>");
        String nome = scan.nextLine();
        conta.setNome(nome);

        System.out.println("Olá, " + nome);
        int opcao = 0;

        do {
            // Exibe o menu de opções
            System.out.println("===== Menu Banco =====");
            System.out.println("1. Depósito");
            System.out.println("2. Resgate");
            System.out.println("3. Investimento");
            System.out.println("4. Visualizar dados");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção escolhida pelo usuário
            opcao = scan.nextInt();

            // Executa a ação de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    conta.deposito();
                    break;
                case 2:
                    conta.resgate();
                    break;
                case 3:
                    conta.investir();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Nome: " + conta.getNome());
                    System.out.println("Saldo: " + conta.getSaldo());
                    System.out.println("Valor Investido: " + conta.getSaldoInvestido());
                    System.out.println("\nPressione Enter para continuar...");

                    // Criar um objeto Scanner para ler a entrada do usuário
                    Scanner scanner = new Scanner(System.in);
                    scanner.nextLine(); // Aguardar o usuário pressionar Enter

                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println();

            conta.bonus();
        } while (opcao != 5);

        scan.close();

        System.out.println(conta.getSaldo());
    }
}