public class Principal {
    public static void main(String[] args) {
        // Testando Farmacia
        Farmacia farmacia = new Farmacia("Farmácia Central", "Rua A, 123", "Dipirona, Paracetamol");
        farmacia.listarMedicamentos();
        farmacia.venderMedicamento("Dipirona");
        farmacia.adicionarMedicamento("Ibuprofeno");

        // Testando FeiraLivre
        FeiraLivre feira = new FeiraLivre("Praça da Matriz", "Tomate, Banana, Laranja", "08h às 14h");
        feira.listarProdutos();
        feira.venderProduto("Banana");
        feira.adicionarProduto("Manga");

        // Testando SalaoBeleza
        SalaodeBeleza salao = new SalaodeBeleza("Beleza Pura", "Corte, Manicure, Escova", "09h às 18h");
        salao.listarServicos();
        salao.agendarServico("Corte");
        salao.adicionarServico("Coloração");
    }
}
