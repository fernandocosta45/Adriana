public class TesteSapato {
    public static void main(String[] args) {
        Sapato s1 = new Sapato("Tênis esportivo", 42, "Nike", 350.0);
        s1.exibirInfo();
        s1.aplicarDesconto(15);
        s1.exibirInfo();
        s1.vender();
        s1.trocar("Sandália casual", 41, "Havaianas");
        s1.exibirInfo();
    }
}