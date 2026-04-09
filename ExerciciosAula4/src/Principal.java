public class Principal {
    public static void main(String[] args) {
        // Instanciando objetos da Farmácia
        Farmacia farmacia = new Farmacia("Farmácia Central", "Rua das Flores, 123", 5);
        farmacia.verificarEstoque();
        farmacia.venderMedicamento();
        farmacia.aplicarDesconto();

        System.out.println("-----------------------------");

        // Instanciando objetos da Feira Livre
        FeiraLivre feira = new FeiraLivre("Maçã", 7.50, 3.0);
        feira.exibirProduto();
        System.out.println("Preço total: R$ " + feira.calcularPrecoTotal());
        feira.aplicarDesconto(10);

        System.out.println("-----------------------------");

        // Instanciando objetos do Salão de Beleza
        SalaoBeleza salao = new SalaoBeleza("Estilo & Beleza", "Manicure", 40.00);
        salao.agendarServico();
        salao.realizarServico();
        salao.aplicarPromocao(20);
    }
}