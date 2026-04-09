
//Objetos vendidos: sapatos, tênis, sandálias.
//Atributos relevantes: modelo, tamanho, preço, marca.
//Comportamentos: vender, trocar, aplicar desconto.

class LojaSapato {
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

    void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Tamanho: " + tamanho +
                ", Marca: " + marca + ", Preço: R$ " + preco);
    }
}
