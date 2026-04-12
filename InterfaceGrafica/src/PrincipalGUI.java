import javax.swing.*;
import java.awt.*;

public class PrincipalGUI extends JFrame {
    public PrincipalGUI() {
        setTitle("Loja - Calculadora de Produtos e Serviços");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Painel para Alimento
        JPanel painelAlimento = new JPanel();
        painelAlimento.setBorder(BorderFactory.createTitledBorder("Alimento"));
        JTextField produtoField = new JTextField(10);
        JTextField precoField = new JTextField(5);
        JTextField quantidadeField = new JTextField(5);
        JTextField descontoAlimentoField = new JTextField(5);
        JButton calcularAlimentoBtn = new JButton("Calcular Preço");
        JButton aplicarDescontoAlimentoBtn = new JButton("Aplicar Desconto");
        JLabel resultadoAlimento = new JLabel("Resultado: ");

        painelAlimento.add(new JLabel("Produto:"));
        painelAlimento.add(produtoField);
        painelAlimento.add(new JLabel("Preço/Kg:"));
        painelAlimento.add(precoField);
        painelAlimento.add(new JLabel("Quantidade (Kg):"));
        painelAlimento.add(quantidadeField);
        painelAlimento.add(calcularAlimentoBtn);
        painelAlimento.add(new JLabel("Desconto (%):"));
        painelAlimento.add(descontoAlimentoField);
        painelAlimento.add(aplicarDescontoAlimentoBtn);
        painelAlimento.add(resultadoAlimento);

        calcularAlimentoBtn.addActionListener(e -> {
            Alimento alimento = new Alimento(produtoField.getText(),
                    Double.parseDouble(precoField.getText()),
                    Double.parseDouble(quantidadeField.getText()));
            resultadoAlimento.setText("Preço total: R$ " + alimento.calcularPrecoTotal());
        });

        aplicarDescontoAlimentoBtn.addActionListener(e -> {
            Alimento alimento = new Alimento(produtoField.getText(),
                    Double.parseDouble(precoField.getText()),
                    Double.parseDouble(quantidadeField.getText()));
            alimento.aplicarDesconto(Double.parseDouble(descontoAlimentoField.getText()));
            resultadoAlimento.setText("Preço com desconto: R$ " + alimento.calcularPrecoTotal());
        });

        // Painel para Medicamento
        JPanel painelMedicamento = new JPanel();
        painelMedicamento.setBorder(BorderFactory.createTitledBorder("Medicamento"));
        JTextField nomeMedField = new JTextField(10);
        JTextField tipoMedField = new JTextField(8);
        JTextField precoMedField = new JTextField(5);
        JTextField validadeMedField = new JTextField(8);
        JTextField descontoMedField = new JTextField(5);
        JButton exibirMedBtn = new JButton("Exibir Info");
        JButton aplicarDescontoMedBtn = new JButton("Aplicar Desconto");
        JLabel resultadoMed = new JLabel("Resultado: ");

        painelMedicamento.add(new JLabel("Nome:"));
        painelMedicamento.add(nomeMedField);
        painelMedicamento.add(new JLabel("Tipo:"));
        painelMedicamento.add(tipoMedField);
        painelMedicamento.add(new JLabel("Preço:"));
        painelMedicamento.add(precoMedField);
        painelMedicamento.add(new JLabel("Validade:"));
        painelMedicamento.add(validadeMedField);
        painelMedicamento.add(exibirMedBtn);
        painelMedicamento.add(new JLabel("Desconto (%):"));
        painelMedicamento.add(descontoMedField);
        painelMedicamento.add(aplicarDescontoMedBtn);
        painelMedicamento.add(resultadoMed);

        exibirMedBtn.addActionListener(e -> {
            Medicamento med = new Medicamento(nomeMedField.getText(),
                    tipoMedField.getText(),
                    Double.parseDouble(precoMedField.getText()),
                    validadeMedField.getText());
            resultadoMed.setText("Info: " + med.nome + " - R$ " + med.preco + " - Validade: " + med.validade);
        });

        aplicarDescontoMedBtn.addActionListener(e -> {
            Medicamento med = new Medicamento(nomeMedField.getText(),
                    tipoMedField.getText(),
                    Double.parseDouble(precoMedField.getText()),
                    validadeMedField.getText());
            med.aplicarDesconto(Double.parseDouble(descontoMedField.getText()));
            resultadoMed.setText("Preço com desconto: R$ " + med.preco);
        });

        // Painel para Serviço de Beleza
        JPanel painelServico = new JPanel();
        painelServico.setBorder(BorderFactory.createTitledBorder("Serviço de Beleza"));
        JTextField nomeServField = new JTextField(10);
        JTextField precoServField = new JTextField(5);
        JTextField duracaoServField = new JTextField(5);
        JTextField descontoServField = new JTextField(5);
        JButton exibirServBtn = new JButton("Exibir Info");
        JButton aplicarDescontoServBtn = new JButton("Aplicar Desconto");
        JLabel resultadoServ = new JLabel("Resultado: ");

        painelServico.add(new JLabel("Serviço:"));
        painelServico.add(nomeServField);
        painelServico.add(new JLabel("Preço:"));
        painelServico.add(precoServField);
        painelServico.add(new JLabel("Duração (min):"));
        painelServico.add(duracaoServField);
        painelServico.add(exibirServBtn);
        painelServico.add(new JLabel("Desconto (%):"));
        painelServico.add(descontoServField);
        painelServico.add(aplicarDescontoServBtn);
        painelServico.add(resultadoServ);

        exibirServBtn.addActionListener(e -> {
            ServicoBeleza servico = new ServicoBeleza(nomeServField.getText(),
                    Double.parseDouble(precoServField.getText()),
                    Integer.parseInt(duracaoServField.getText()));
            resultadoServ.setText("Info: " + nomeServField.getText() +
                    " - Preço: R$ " + precoServField.getText() +
                    " - Duração: " + duracaoServField.getText() + " min");
        });

        aplicarDescontoServBtn.addActionListener(e -> {
            ServicoBeleza servico = new ServicoBeleza(nomeServField.getText(),
                    Double.parseDouble(precoServField.getText()),
                    Integer.parseInt(duracaoServField.getText()));
            servico.aplicarDesconto(Double.parseDouble(descontoServField.getText()));
            resultadoServ.setText("Preço com desconto: R$ " + servico.getPreco());
        });

        // Adiciona os painéis à janela
        add(painelAlimento);
        add(painelMedicamento);
        add(painelServico);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PrincipalGUI();
    }
}