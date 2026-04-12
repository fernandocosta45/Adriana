public class TesteMedicamento {
    public static void main(String[] args) {
        Medicamento m1 = new Medicamento("Paracetamol", "comum", 15.0, "12/2026");
        m1.exibirInfo();
        m1.verificarValidade();
        m1.aplicarDesconto(10);
        m1.exibirInfo();
        m1.vender();
    }
}