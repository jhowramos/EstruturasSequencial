import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n1 = leitura.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = leitura.nextDouble();
        double soma = n1+n2;
        System.out.println("A soma dos dois números é: "+soma);
        leitura.close();
    }
}
