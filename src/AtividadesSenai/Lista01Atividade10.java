package AtividadesSenai;

import java.util.Scanner;

public class Lista01Atividade10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vel, maxVel;

        System.out.println("Inicio do porograma...");

        System.out.println("Digite sa velocidade: ");
        vel = sc.nextInt();
        System.out.println("Digite o limete de velocidade da via: ");
        maxVel = sc.nextInt();

        if(vel > (maxVel + 1) && vel <= (maxVel + 10)){
            System.out.println("Muta: R$ 50,00");
        }
        else if(vel > (maxVel + 10) && vel <= (maxVel + 30)){
            System.out.println("Muta: R$ 100,00");
        }
        else if (vel >= (maxVel + 31)) {
            System.out.println("Muta: R$ 200,00");
        }
    }
}
