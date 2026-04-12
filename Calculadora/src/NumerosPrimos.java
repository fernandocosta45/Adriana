// Como usurário da calculadora, quero gerar uma sequência de números primos até o decimo termo.

public class NumerosPrimos {
    public static void main(String[] args) {
        int contador = 0;   // Conta quantos primos já foram encontrados
        int numero = 2;     // Primeiro número a ser testado

        System.out.println("Sequência dos 10 primeiros números primos:");

        while (contador < 10) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }

    // Função que verifica se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}