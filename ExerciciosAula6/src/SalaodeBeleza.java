// Classe SalaoBeleza
public class SalaodeBeleza {
    private String nome;
    private String listaServicos;
    private String horarioAtendimento;

    public SalaodeBeleza(String nome, String listaServicos, String horarioAtendimento) {
        this.nome = nome;
        this.listaServicos = listaServicos;
        this.horarioAtendimento = horarioAtendimento;
    }

    public void agendarServico(String servico) {
        System.out.println("Agendando serviço: " + servico);
    }

    public void adicionarServico(String servico) {
        System.out.println("Adicionando serviço: " + servico);
    }

    public void listarServicos() {
        System.out.println("Serviços disponíveis: " + listaServicos);
    }
}