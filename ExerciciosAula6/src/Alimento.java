//Objetos vendidos: frutas, verduras, legumes.
//Atributos relevantes: produto, preço por Kg, quantidade em Kg.
//Comportamentos: calcular preço total, exibir produto, aplicar desconto.

public class Alimento {
    private String produto;
    private double precoPorKg;
    private double quantidadeKg;

    public Alimento(String produto, double precoPorKg, double quantidadeKg) {
        this.produto = produto;
        this.precoPorKg = precoPorKg;
        this.quantidadeKg = quantidadeKg;
    }

    public double calcularPrecoTotal() {
        return precoPorKg * quantidadeKg;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + produto + ", Quantidade: " + quantidadeKg + " Kg");
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            precoPorKg -= precoPorKg * (percentual / 100);
            System.out.println("Novo preço por Kg após desconto: R$ " + precoPorKg);
        }
    }
}