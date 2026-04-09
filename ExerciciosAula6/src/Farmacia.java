// Classe Farmacia
public class Farmacia {
    private String nome;
    private String endereco;
    private String estoqueMedicamentos;

    public Farmacia(String nome, String endereco, String estoqueMedicamentos) {
        this.nome = nome;
        this.endereco = endereco;
        this.estoqueMedicamentos = estoqueMedicamentos;
    }

    public void venderMedicamento(String medicamento) {
        System.out.println("Vendendo medicamento: " + medicamento);
    }

    public void adicionarMedicamento(String medicamento) {
        System.out.println("Adicionando medicamento: " + medicamento);
    }

    public void listarMedicamentos() {
        System.out.println("Medicamentos disponíveis: " + estoqueMedicamentos);
    }
}
