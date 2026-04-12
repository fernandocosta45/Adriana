//Objetos vendidos: serviços de beleza (corte de cabelo, escova, depilação, maquiagem, etc).
//Atributos relevantes: nome do serviço, preço, duração.
//Comportamentos: vender, aplicar desconto, exibir informações.

public class ServicoBeleza {
    private String nomeServico;
    private double preco;
    private int duracaoMinutos; // duração do serviço em minutos

    public ServicoBeleza(String nomeServico, double preco, int duracaoMinutos) {
        this.nomeServico = nomeServico;
        this.preco = preco;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void vender() {
        System.out.println("O serviço de " + nomeServico + " foi realizado.");
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
            System.out.println("Novo preço do serviço após desconto: R$ " + preco);
        }
    }

    public void exibirInfo() {
        System.out.println("Serviço: " + nomeServico + ", Preço: R$ " + preco +
                ", Duração: " + duracaoMinutos + " minutos");
    }
}