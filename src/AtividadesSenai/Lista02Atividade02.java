package AtividadesSenai;

import java.util.Scanner;

public class Lista02Atividade02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salario, newSal;

        System.out.println("Digite o nome do funcionario: ");
        nome = teclado.next();

        System.out.println("Digite o Salário do funcionario: ");
        salario = teclado.nextDouble();

        newSal = salario + (salario * 0.25f);

        System.out.printf("O novo salário do funcionario é: R$ %.2f", newSal);
    }
}
