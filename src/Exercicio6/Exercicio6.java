import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        double raio = scan.nextFloat();
        double area = Math.PI * raio * raio;
        System.out.printf("O valor da area é [%.1f]",area);
        scan.close();
    }
}
