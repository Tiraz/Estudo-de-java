package AtividadesSenai;


import java.util.Scanner;

public class Lista01Atividade08 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua idade ?");
        int idade = teclado.nextInt();

        if(idade < 0){
            System.out.println("Valor inválido!");
        }
        else if(idade <= 12){
            System.out.println("Criança");
        }
        else if (idade >= 13 && idade <= 17 ) {
            System.out.println("Adolecente");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        }
        else{
            System.out.println("especialista");
        }
    }
}
