import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite quanto você ganha por horas trabalhadas:");
        double horasTrabalhadas = ler.nextFloat();
        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double horasTrabalhadaMes = ler.nextFloat();
        double somaHorasTrabalhadas = horasTrabalhadas * horasTrabalhadaMes;
        System.out.printf("Seu salário nesse referido mês é: %.2f", somaHorasTrabalhadas);
        ler.close();
    }
}
