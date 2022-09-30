import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        /* Faça um Programa que peça a temperatura em graus Celsius,
        transforme e mostre em graus Fahrenheit.
         */
        Scanner ler = new Scanner (System.in);
        System.out.println("Qual a temperatura em Celsius? ");
        double tempCelsius = ler.nextFloat();
        double conversao = (tempCelsius * 1.8) +32;
        System.out.printf("Resultado da conversão: %.2f Fahrenheit", conversao);
    }
}
