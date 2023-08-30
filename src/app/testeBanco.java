package app;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEspecial;

public class TesteBanco {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(1454, "09800404", 1000.0);
        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:\n"
                    + "1 - CONTA POUPANÇA\n"
                    + "2 - CONTA CORRENTE\n"
                    + "3 - CONTA ESPECIAL\n"
                    + "4 - CONTA EMPRESA\n"
                    + "5 - CONTA ESTUDANTIL\n"
                    + "6 - SAIR");

            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("LÓGICA DA CONTA POUPANÇA");
                    break;
                case 2:
                    ContaCorrente cc = new ContaCorrente(12346, "9960021564");
                    System.out.println("\nDigite o valor do depósito:");
                    double valor = leia.nextDouble();
                    cc.credito(valor);

                    System.out.println(cc);

                    System.out.println("\nDigite o valor a ser sacado:");
                    double sacarValor = leia.nextDouble();
                    cc.debito(sacarValor);

                    System.out.println(cc);

                    System.out.println("\nDigite quantos talões você deseja pedir:");
                    int comprarTalao = leia.nextInt();
                    cc.pedirTalao(comprarTalao);

                    System.out.println(cc);
                    break;
                case 3:
                    System.out.println("CONTA ESPECIAL");
                    System.out.println("Seu limite especial é: R$" + conta1.getLimite());
                    System.out.println("Seu saldo é de: R$" + conta1.getSaldo());
                    System.out.println("Insira o valor do saque:");
                    double auxSaque = leia.nextDouble();
                    conta1.debito(auxSaque);
                    break;
                case 4:
                    System.out.println("CONTA EMPRESA");
                    break;
                case 5:
                    System.out.println("CONTA ESTUDANTIL");
                    break;
                case 6:
                    System.out.println("VOLTE SEMPRE");
                    leia.close(); 
                    System.exit(0); 
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
