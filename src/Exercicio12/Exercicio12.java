import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        double altura = ler.nextDouble();
        double pesoIdeal = (72.7*altura) - 58;
        ler.close();
        System.out.printf("Seu peso ideal para sua altura é de: %6.2f ", pesoIdeal);
    }
}
