public class SalaoBeleza {
    private String nome;
    private String servico;
    private double preco;

    public SalaoBeleza(String nome, String servico, double preco) {
        this.nome = nome;
        this.servico = servico;
        this.preco = preco;
    }

    public void agendarServico() {
        System.out.println("Serviço " + servico + " agendado no salão " + nome);
    }

    public void realizarServico() {
        System.out.println("Serviço " + servico + " realizado com sucesso!");
    }

    public void aplicarPromocao(double percentual) {
        preco -= preco * (percentual / 100);
        System.out.println("Preço promocional do serviço " + servico + ": R$ " + preco);
    }
}
