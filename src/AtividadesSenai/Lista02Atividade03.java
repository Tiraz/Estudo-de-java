package AtividadesSenai;

import java.util.Scanner;

public class Lista02Atividade03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double salario, newSal;


        System.out.println("Digite o Salário bruto do funcionario: ");
        salario = teclado.nextDouble();

        newSal = salario + (salario * 0.10f);

        newSal = newSal - (newSal * 0.15f);

        System.out.printf("O salário do funcionario é: R$ %.2f", newSal);
    }
}
