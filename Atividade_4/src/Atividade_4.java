public class Atividade_4 {

    /*
     * Programa para calcular o gasto total do primeiro trimestre
     * e a média mensal de gastos da empresa.
     */
    public static void main(String[] args) {
        // Valores dos gastos em reais
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        // Cálculo do total e da média
        int total = janeiro + fevereiro + marco;
        double media = total / 3.0;

        // Impressão dos resultados
        System.out.println("Despesa total no trimestre: R$ " + total);
        System.out.println("Média mensal de gastos: R$ " + media);
    }
}
