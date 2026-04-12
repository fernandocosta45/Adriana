public class ServicoBeleza {
    private String nomeServico;
    private double preco;
    private int duracaoMinutos; // duração do serviço em minutos

    public ServicoBeleza(String nomeServico, double preco, int duracaoMinutos) {
        this.nomeServico = nomeServico;
        this.preco = preco;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void vender() {
        System.out.println("O serviço de " + nomeServico + " foi realizado.");
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double precoOriginal = preco;
            preco -= preco * (percentual / 100);
            System.out.println("Serviço: " + nomeServico +
                    ", Duração (min): " + duracaoMinutos +
                    ", Preço original: R$ " + precoOriginal +
                    ", Preço total sem desconto: R$ " + precoOriginal +
                    "\nPreço total com desconto: R$ " + preco);
        }
    }

    public void exibirInfo() {
        System.out.println("Serviço: " + nomeServico +
                ", Duração (min): " + duracaoMinutos +
                ", Preço: R$ " + preco +
                ", Preço total sem desconto: R$ " + preco);
    }

    // ✅ Getter para o preço
    public double getPreco() {
        return preco;
    }
}