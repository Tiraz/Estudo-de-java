package AtividadesSenai;

import java.util.Scanner;

public class Lista01Atividade11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o código do lanche: ");
        int cod = teclado.nextInt();

        switch (cod){
            case 1:
                System.out.println("Lanche: BigMac");
                break;
            case 2:
                System.out.println("Lanche: Quarteirão");
                break;
            case 3:
                System.out.println("Lanche: McChiken");
                break;
            case 4:
                System.out.println("Lanche: Cheddar McMelt");
                break;
            case 5:
                System.out.println("Lanche: McMax");
                break;
            default:
                System.out.println("Código do lanche invalido!");
                break;
        }
    }
}
