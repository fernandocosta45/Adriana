// Como usurário da calculadora, quero calcular o fatorial de um determinado número.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário o número desejado
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Calcula o fatorial
        long resultado = calcularFatorial(numero);

        // Exibe o resultado
        System.out.println("O fatorial de " + numero + " é: " + resultado);

        scanner.close();
    }

    // Função para calcular fatorial
    public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}