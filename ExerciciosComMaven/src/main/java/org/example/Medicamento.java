package org.example;

public class Medicamento {
    String nome;
    String tipo;
    double preco;
    String validade;

    public Medicamento(String nome, String tipo, double preco, String validade) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.validade = validade;
    }

    public void verificarValidade() {
        System.out.println("Validade do medicamento " + nome + ": " + validade);
    }

    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Tipo: " + tipo +
                ", Preço: R$ " + preco + ", Validade: " + validade);
    }

    public void vender() {
        System.out.println("O medicamento " + nome + " foi vendido.");
    }
}
