package org.example;

public class Principal {
    public static void main(String[] args) {
        // Instanciando Farmacia
        Farmacia farmacia = new Farmacia("Farmácia Central", "Rua A, 123", "Dipirona, Paracetamol");
        System.out.println("=== Testando Farmacia ===");
        farmacia.listarMedicamentos();
        farmacia.venderMedicamento("Dipirona");
        farmacia.adicionarMedicamento("Ibuprofeno");

        // Instanciando FeiraLivre
        FeiraLivre feira = new FeiraLivre("Praça da Matriz", "Tomate, Banana, Laranja", "08h às 14h");
        System.out.println("\n=== Testando Feira Livre ===");
        feira.listarProdutos();
        feira.venderProduto("Banana");
        feira.adicionarProduto("Manga");

        // Instanciando SalaoBeleza
        SalaoBeleza salao = new SalaoBeleza("Beleza Pura", "Corte, Manicure, Escova", "09h às 18h");
        System.out.println("\n=== Testando Salão de Beleza ===");
        salao.listarServicos();
        salao.agendarServico("Corte");
        salao.adicionarServico("Coloração");
    }
}
