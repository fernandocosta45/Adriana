public class Farmacia {
    private String nome;
    private String endereco;
    private int estoque;

    public Farmacia(String nome, String endereco, int estoque) {
        this.nome = nome;
        this.endereco = endereco;
        this.estoque = estoque;
    }

    public void venderMedicamento() {
        if (estoque > 0) {
            estoque--;
            System.out.println("Medicamento vendido. Estoque atual: " + estoque);
        } else {
            System.out.println("Estoque esgotado!");
        }
    }

    public void verificarEstoque() {
        System.out.println("Estoque disponível: " + estoque);
    }

    public void aplicarDesconto() {
        System.out.println("Desconto aplicado em medicamentos selecionados.");
    }
}