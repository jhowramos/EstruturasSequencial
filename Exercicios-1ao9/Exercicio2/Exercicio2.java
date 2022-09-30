import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[]args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = leitura.nextInt();
        System.out.println("O número informado foi: "+ numero);
        leitura.close();
    }
}
