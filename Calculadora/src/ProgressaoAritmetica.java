// Como usurário da calculadora, quero inserir o primeiro termo e a razão e o número do termo que deseja descobrir.

import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        System.out.print("Digite o número do termo que deseja descobrir: ");
        int n = scanner.nextInt();

        // Fórmula do n-ésimo termo da PA: an = a1 + (n - 1) * r
        int termo = primeiroTermo + (n - 1) * razao;

        // Saída
        System.out.println("O " + n + "º termo da PA é: " + termo);

        scanner.close();
    }
}