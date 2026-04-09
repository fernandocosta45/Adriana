
//Objetos vendidos: medicamentos, cosméticos.
//Atributos relevantes: nome, tipo (controlado, comum), preço, validade.
//Comportamentos: vender, verificar validade, aplicar desconto.

class Farmacia {
    String nome;
    String tipo; // controlado ou comum
    double preco;
    String validade;

    Farmacia(String nome, String tipo, double preco, String validade) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.validade = validade;
    }

    void verificarValidade() {
        System.out.println("Validade do medicamento " + nome + ": " + validade);
    }

    void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome + ", Tipo: " + tipo +
                ", Preço: R$ " + preco + ", Validade: " + validade);
    }
}