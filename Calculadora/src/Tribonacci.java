// Como usurário da calculadora, quero gerar a sequência de Tribonacci mostrando a quantidade de termos que desejar.

import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantos termos deseja
        System.out.print("Digite a quantidade de termos da sequência de Tribonacci: ");
        int termos = scanner.nextInt();

        // Inicializa os três primeiros números da sequência
        int primeiro = 0, segundo = 1, terceiro = 1;

        System.out.println("Sequência de Tribonacci com " + termos + " termos:");

        for (int i = 1; i <= termos; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo + terceiro;
            primeiro = segundo;
            segundo = terceiro;
            terceiro = proximo;
        }

        scanner.close();
    }
}