import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args){
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = leitura.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitura.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = leitura.nextDouble();
        System.out.println("Digite a quarta nota:");
        double nota4 = leitura.nextDouble();
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média é: " + media);
        leitura.close();
    }
}
