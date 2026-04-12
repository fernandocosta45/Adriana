// Como usurário da calculadora, quero determinar o quadrado de qualquer enésima parte até o resultado seja igual ou menor ao número 100}

public class Quadrado {
    public static void main(String[] args) {
        System.out.println("Sequência de quadrados até 100:");

        int n = 1;
        int quadrado = n * n;

        while (quadrado <= 100) {
            System.out.println("O quadrado de " + n + " é: " + quadrado);
            n++;
            quadrado = n * n;
        }
    }
}