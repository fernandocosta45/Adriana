// Como usurário da calculadora, quero determinar o cubo de qualquer enésima parte até o valor 1000.

public class Cubo {
    public static void main(String[] args) {
        System.out.println("Sequência de cubos até 1000:");

        int n = 1;
        int cubo = n * n * n;

        while (cubo <= 1000) {
            System.out.println("O cubo de " + n + " é: " + cubo);
            n++;
            cubo = n * n * n;
        }
    }
}