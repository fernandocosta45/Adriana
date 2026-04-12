// Como usurário da calculadora, quero gerar a sequência de Fibonacci mostrando a quantidade de termos que desejar.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantos termos deseja
        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int termos = scanner.nextInt();

        // Inicializa os dois primeiros números da sequência
        int primeiro = 0, segundo = 1;

        System.out.println("Sequência de Fibonacci com " + termos + " termos:");

        for (int i = 1; i <= termos; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}