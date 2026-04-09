// Classe FeiraLivre
public class FeiraLivre {
    private String local;
    private String listaProdutos;
    private String horarioFuncionamento;

    public FeiraLivre(String local, String listaProdutos, String horarioFuncionamento) {
        this.local = local;
        this.listaProdutos = listaProdutos;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public void venderProduto(String produto) {
        System.out.println("Vendendo produto: " + produto);
    }

    public void adicionarProduto(String produto) {
        System.out.println("Adicionando produto: " + produto);
    }

    public void listarProdutos() {
        System.out.println("Produtos disponíveis: " + listaProdutos);
    }
}