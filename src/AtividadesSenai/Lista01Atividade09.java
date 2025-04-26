package AtividadesSenai;

import java.util.Scanner;

public class Lista01Atividade09 {
    public static void main(String[] agrs){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o código da função: ");
        int cod = teclado.nextInt();

        switch (cod){
            case 1:
                System.out.println("Ocupação: Matemático");
                break;
            case 2:
                System.out.println("Ocupação: Analista de Sistemas");
                break;
            case 3:
                System.out.println("Ocupação: Físico");
                break;
            case 4:
                System.out.println("Ocupação: Arquiteto");
                break;
            case 5:
                System.out.println("Ocupação: Piloto de Aeronaves");
                break;
            default:
                System.out.println("Código invalido!");
                break;
        }
    }
}
