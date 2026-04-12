public class Medicamento {
    String nome;
    String tipo; // controlado ou comum
    double preco;
    String validade;

    Medicamento(String nome, String tipo, double preco, String validade) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.validade = validade;
    }

    void verificarValidade() {
        System.out.println("Validade do medicamento " + nome + ": " + validade);
    }

    void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double precoOriginal = preco;
            preco -= preco * (percentual / 100);
            System.out.println("Nome: " + nome +
                    ", Tipo: " + tipo +
                    ", Validade: " + validade +
                    ", Preço original: R$ " + precoOriginal +
                    ", Preço total sem desconto: R$ " + precoOriginal +
                    "\nPreço total com desconto: R$ " + preco);
        }
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome +
                ", Tipo: " + tipo +
                ", Preço: R$ " + preco +
                ", Validade: " + validade +
                ", Preço total sem desconto: R$ " + preco);
    }

    void vender() {
        System.out.println("O medicamento " + nome + " foi vendido.");
    }
}