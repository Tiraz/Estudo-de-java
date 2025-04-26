package AtividadesSenai;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

public class Lista02Atividade01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3;
        int peso1, peso2, peso3;

        System.out.println("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        peso1 = teclado.nextInt();
        nota1 = nota1 * peso1;

        System.out.println("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.println("Digite o peso da segunda nota: ");
        peso2 = teclado.nextInt();
        nota2 = nota2 * peso2;

        System.out.println("Digite a terceira nota: ");
        nota3 = teclado.nextDouble();
        System.out.println("Digite o peso da terceira nota: ");
        peso3 = teclado.nextInt();
        nota3 = nota3 * peso3;

        nota1 = nota1 + nota2 + nota3;
        peso1 = peso1 + peso2 + peso3;

        double media = nota1 / peso1;

        System.out.printf("A média do aluno é: %.2f", media);
    }
}
