package AtividadesSenai;

import java.util.Scanner;

public class Lista01Atividade12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o número do primeiro lado do triangulo: ");
        num1 = teclado.nextInt();

        System.out.println("Digite o número do segundo lado do triangulo: ");
        num2 = teclado.nextInt();

        System.out.println("Digite o número do terceiro lado do triangulo: ");
        num3 = teclado.nextInt();
        
        if(num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println("Triangulo é Equilátero!");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Triangulo é Isósceles!");
        }else {
            System.out.println("Triangulo é Escaleno!");
        }
    }
}
