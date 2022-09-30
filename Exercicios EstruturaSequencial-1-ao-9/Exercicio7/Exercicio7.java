import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        double lado = ler.nextFloat();
        double soma = lado * lado;
        System.out.printf("O dobro desta área é: %.2f", (soma*2));
        ler.close();
    }
}
