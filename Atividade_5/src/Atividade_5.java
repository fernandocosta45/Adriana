import java.util.Scanner;
import java.util.Locale;

public class Atividade_5 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            entrada.useLocale(Locale.US); // aceita ponto como separador decimal
            // Se quiser aceitar vírgula, use: entrada.useLocale(new Locale("pt", "BR"));

            double p1  = lerNota(entrada, "Digite a nota da P1: ");
            double e1  = lerNota(entrada, "Digite a nota da E1: ");
            double e2  = lerNota(entrada, "Digite a nota da E2: ");
            double x   = lerNota(entrada, "Digite a nota de X: ");
            double api = lerNota(entrada, "Digite a nota da API: ");

            double mediaFinal = calcularMedia(p1, e1, e2, x);
            boolean aprovado = false;

            // 1ª tentativa: sem SUB
            if (mediaFinal >= 6) {
                mediaFinal = aplicarAPI(mediaFinal, api);
                aprovado = mediaFinal >= 6;
            }

            // 2ª tentativa: com SUB
            if (!aprovado) {
                double sub = lerNota(entrada, "Digite a nota da SUB: ");
                mediaFinal = calcularMediaComSub(p1, e1, e2, x, sub);
                if (mediaFinal >= 6) {
                    mediaFinal = aplicarAPI(mediaFinal, api);
                    aprovado = mediaFinal >= 6;
                }
            }

            // 3ª tentativa: com EXF
            if (!aprovado) {
                double exf = lerNota(entrada, "Digite a nota do EXF: ");
                mediaFinal = exf;
                aprovado = mediaFinal >= 6;
            }

            System.out.println("Média final do aluno: " + mediaFinal);
            System.out.println(aprovado ? "Aluno APROVADO" : "Aluno REPROVADO");
        }
    }

    private static double lerNota(Scanner entrada, String mensagem) {
        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    private static double calcularMedia(double p1, double e1, double e2, double x) {
        return (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x;
    }

    private static double calcularMediaComSub(double p1, double e1, double e2, double x, double sub) {
        return (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15);
    }

    private static double aplicarAPI(double media, double api) {
        return (media * 0.5) + (api * 0.5);
    }
}
