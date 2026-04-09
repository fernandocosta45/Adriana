public class FeiraLivre {
    private String produto;
    private double precoPorKg;
    private double quantidadeKg;

    public FeiraLivre(String produto, double precoPorKg, double quantidadeKg) {
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
        precoPorKg -= precoPorKg * (percentual / 100);
        System.out.println("Novo preço por Kg após desconto: R$ " + precoPorKg);
    }
}
