package AtividadesSenai;

import java.util.Scanner;

public class Lista02Atividade04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double altura, base, area;

        System.out.println("Digite o valor da base do triangulo: ");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do triangulo: ");
        altura = teclado.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("A área do triangulo é: %.2f", area);

    }
}
