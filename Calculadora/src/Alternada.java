// Como usuário da caluladora desejo calcular a sequência alternada de um número.

import java.util.Scanner;

public class Alternada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número inicial da sequência: ");
        int numeroInicial = scanner.nextInt();

        System.out.print("Digite o padrão de acréscimo/subtração: ");
        int padrao = scanner.nextInt();

        System.out.print("Digite a quantidade de termos que deseja gerar: ");
        int termos = scanner.nextInt();

        // Geração da sequência alternada
        int atual = numeroInicial;
        System.out.println("Sequência alternada:");
        for (int i = 1; i <= termos; i++) {
            System.out.print(atual + " ");
            if (i % 2 == 1) {
                // Nos termos ímpares, soma o padrão
                atual += padrao;
            } else {
                // Nos termos pares, subtrai o padrão
                atual -= padrao;
            }
        }

        scanner.close();
    }
}