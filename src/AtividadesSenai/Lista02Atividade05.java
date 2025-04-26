package AtividadesSenai;

import java.util.Scanner;

public class Lista02Atividade05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Double area, perimetro, raio, pi = 3.1416;

        System.out.println("Digite o valor do raio do circulo: ");
        raio = teclado.nextDouble();

        area = pi * (raio * raio);
        perimetro = (raio * 2) * pi;

        System.out.println("Área: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
