package AtividadesSenai;

public class Lista01Atividade07 {
    public static void main(String[] args){
        int num1, num2, mais, menos, mult;
        double div, mod;
        num1 = 5;
        num2 = 10;
        mais = num1 + num2;
        menos = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("%d + %d = %d",num1,num2,mais);
        System.out.println(" ");
        System.out.printf("%d - %d = %d",num1,num2,menos);
        System.out.println(" ");
        System.out.printf("%d * %d = %d",num1,num2,mult);
        System.out.println(" ");
        System.out.printf("%d / %d = %f",num1,num2,div);
        System.out.println(" ");
        System.out.printf("%d modulo %d = %f",num1,num2,mod);
    }
}
