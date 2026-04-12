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
        System.out.println("Produto: " + produto +
                ", Preço/Kg: R$ " + precoPorKg +
                ", Quantidade: " + quantidadeKg + " Kg" +
                ", Preço total sem desconto: R$ " + calcularPrecoTotal());
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double precoOriginal = precoPorKg;
            precoPorKg -= precoPorKg * (percentual / 100);
            System.out.println("Produto: " + produto +
                    ", Preço/Kg original: R$ " + precoOriginal +
                    ", Quantidade: " + quantidadeKg + " Kg" +
                    ", Preço total sem desconto: R$ " + (precoOriginal * quantidadeKg) +
                    "\nPreço total com desconto: R$ " + calcularPrecoTotal());
        }
    }
}
