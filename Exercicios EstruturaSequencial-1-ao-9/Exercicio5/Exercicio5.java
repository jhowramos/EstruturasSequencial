import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros que deseja converter para cm: ");
        float metros = ler.nextFloat();
        float centimetros = metros * 100;
        ler.close();
        System.out.printf("%.1f cm", centimetros);

    }
}
