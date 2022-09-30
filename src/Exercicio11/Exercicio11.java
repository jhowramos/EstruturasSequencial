import java.util.Scanner;

public class Exercicio11 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o 1 número inteiro:");
        int n1 = ler.nextInt();
        System.out.println("Digite o 2 número inteiro:");
        int n2 = ler.nextInt();
        System.out.println("Digite o número real:");
        double n3 = ler.nextFloat();
        double int1 = (2*n1) * (n2/2);
        double int2 = (3*n1)+n3;
        double int3 = n3*n3*n3;
        System.out.printf("O produto do dobro do primeiro com metade do segundo é igual a %.2f",int1);
        System.out.println();
        System.out.printf("A soma do triplo do primeiro com o terceiro é igual a %.2f",int2);
        System.out.println();
        System.out.printf("O terceiro elevado ao cubo é igual a %.2f",int3);
    }
    }
