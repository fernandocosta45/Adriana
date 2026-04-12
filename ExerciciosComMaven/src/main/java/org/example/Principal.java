package org.example;

public class Principal {
    public static void main(String[] args) {
        Medicamento remedio = new Medicamento("Dipirona", "comum", 12.0, "11/2027");
        remedio.exibirInfo();
        remedio.verificarValidade();
        remedio.aplicarDesconto(10);
        remedio.exibirInfo();
        remedio.vender();

        System.out.println("-----------------------------");

        Alimento alimento = new Alimento("Maçã", 7.5, 2.0);
        alimento.exibirProduto();
        System.out.println("Preço total: R$ " + alimento.calcularPrecoTotal());
        alimento.aplicarDesconto(20);
        System.out.println("Preço total com desconto: R$ " + alimento.calcularPrecoTotal());

        System.out.println("-----------------------------");

        ServicoBeleza servico = new ServicoBeleza("Escova", 80.0, 40);
        servico.exibirInfo();
        servico.aplicarDesconto(15);
        servico.exibirInfo();
        servico.vender();
    }
}