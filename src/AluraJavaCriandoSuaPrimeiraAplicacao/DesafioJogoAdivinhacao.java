package AluraJavaCriandoSuaPrimeiraAplicacao;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdivinhacao {

    public static void main(String[] args) {
        //Variáveis
        Scanner sc = new Scanner(System.in);
        int numeroTentativas = 5;
        int numeroSecreto = new Random().nextInt(100);
        boolean res = false;
        int num = 0;

        //inicio do programa
        System.out.println("Jogo número secreto.");
        System.out.println("Você possui 5 tentativas para acertar o número secreto, boa sorte!");
        System.out.println("Inicio do jogo...");

        //processamento
        while (numeroTentativas > 0){
            System.out.println("Digete o número ");
            num = sc.nextInt();

            numeroTentativas--;
            if (num == numeroSecreto ){
                res = true;
                break;
            }else{
                if(numeroTentativas > 0){
                    if (num > numeroSecreto){
                        System.out.println("O número secreto é menor que: " + num);
                    } else {
                        System.out.println("O número secreto é maior que: " + num);
                    }
                }
            }
        }

        //Saída
        if (res){
            String text = (5 - numeroTentativas) > 1 ? " tentativas":" tentativa";
            System.out.println("Parabéns você acertou o número secreto " + num + " em " + (5 - numeroTentativas) +
                    text);
        }
        else {
            System.out.println("Mais sorte na próxima vez! o número secreto era: " + numeroSecreto);
        }


        System.out.println("Fim do jogo...");

    }
}