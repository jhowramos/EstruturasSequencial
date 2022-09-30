import java.util.Scanner;

public class Exercicio9 {
    public static void main (String[] args){
        //Faça um Programa que peça
        // a temperatura em graus Fahrenheit, transforme e
        // mostre a temperatura em graus Celsius.
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a temperatura em Fahrenheit? ");
        double tempFah = ler.nextFloat();
        double conversao = 5 * ((tempFah-32) / 9);
        System.out.printf("Resultado da conversão: %.2f Graus Celsius", conversao);
        ler.close();
    }
}
