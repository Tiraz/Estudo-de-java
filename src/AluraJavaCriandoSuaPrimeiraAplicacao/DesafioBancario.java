package AluraJavaCriandoSuaPrimeiraAplicacao;

import java.util.Scanner;

public class DesafioBancario {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Decraração de variáveis
        int escolha = 0;
        String nomeCliente = "Hugo Suterio";
        double saldoCliente = 2500;
        String tipoDeConta = "Corrente";

        //Início programa
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println();

        System.out.println("Dados iníciais do clientes.");
        System.out.println();

        System.out.println("Nome: " + nomeCliente);
        System.out.println("Saldo: " + saldoCliente);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println();

        System.out.println("*******************************************************");
        System.out.println();

        while (escolha != 4){

            menuEscolhas();
            escolha = sc.nextInt();

            switch (escolha){
                case 1://Está opção mostra o saldo
                    System.out.println();
                    System.out.println("*******************************************************");
                    System.out.println();
                    System.out.printf("Saldo atual: %.2f", saldoCliente);
                    System.out.println();
                    break;
                case 2://Está opção é para realizar depositos na conta
                    System.out.println();
                    System.out.println("*******************************************************");
                    System.out.println();
                    System.out.println("Digite o valor depositado:");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0){
                        System.out.println("Valor inválido!");
                    }else {
                        saldoCliente += deposito;
                    }
                    break;
                case 3://Está opção é para realizar transferências
                    System.out.println();
                    System.out.println("*******************************************************");
                    System.out.println("Digete o valor a ser transferido");
                    double valor = sc.nextDouble();
                    if (valor > saldoCliente){
                        System.out.println();
                        System.out.println("Saldo insuficiente.");
                    }else {
                        System.out.println();
                        System.out.println("Transferência realizada com sucesso!");
                        saldoCliente -= valor;
                    }
                    break;
                case 4://Está opção finaliza o acesso a conta
                    System.out.println();
                    System.out.println("*******************************************************");
                    System.out.println("Saindo da conta...");
                    System.out.println("Acesso finalizado");
                    break;
                default:
                    System.out.println();
                    System.out.println("*******************************************************");
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
            System.out.println("*******************************************************");
        }

    }
    public static void menuEscolhas(){
        System.out.println();
        System.out.println("Operações");
        System.out.println();

        System.out.println("1- Consutar saldos.");
        System.out.println("2- Receber valor.");
        System.out.println("3- Transferir valor.");
        System.out.println("4- Sair.");

        System.out.println();
        System.out.println();

        System.out.println("Digite a opção desejada");
    }

}
