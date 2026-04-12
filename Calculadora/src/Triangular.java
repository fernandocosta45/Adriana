// Como usurário da calculadora, quero informar uma determinada posição da sequência triangular e obter o valor correspondente àquela posição.

import java.util.Scanner;

public class Triangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário a posição desejada
        System.out.print("Digite a posição da sequência triangular: ");
        int posicao = scanner.nextInt();

        // Calcula o número triangular usando a fórmula
        int triangular = (posicao * (posicao + 1)) / 2;

        // Exibe o resultado
        System.out.println("O número triangular na posição " + posicao + " é: " + triangular);

        scanner.close();
    }
}