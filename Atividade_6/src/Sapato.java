//Objetos vendidos: sapatos, tênis, sandálias.
//Atributos relevantes: modelo, tamanho, preço, marca.
//Comportamentos: vender, trocar, aplicar desconto.

class Sapato {
    String modelo;
    int tamanho;
    String marca;
    double preco;

    Sapato(String modelo, int tamanho, String marca, double preco) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.marca = marca;
        this.preco = preco;
    }

    void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    void vender() {
        System.out.println("O sapato " + modelo + " da marca " + marca + " foi vendido.");
    }

    void trocar(String novoModelo, int novoTamanho, String novaMarca) {
        System.out.println("O sapato " + modelo + " foi trocado por " + novoModelo + " da marca " + novaMarca);
        this.modelo = novoModelo;
        this.tamanho = novoTamanho;
        this.marca = novaMarca;
    }

    void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Tamanho: " + tamanho +
                ", Marca: " + marca + ", Preço: R$ " + preco);
    }
}