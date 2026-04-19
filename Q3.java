import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            precos[i] = sc.nextDouble();
        }

        int p = sc.nextInt();

        double totalAntes = calcularTotal(precos);
        double[] novosPrecos = reajustar(precos, p);
        double totalDepois = calcularTotal(novosPrecos);

        System.out.println("Novos precos:");
        for (int i = 0; i < novosPrecos.length; i++) {
            System.out.printf("%.2f ", novosPrecos[i]);
        }
        System.out.println();

        System.out.printf("Total antes do reajuste: %.2f\n", totalAntes);
        System.out.printf("Total depois do reajuste: %.2f\n", totalDepois);

        sc.close();
    }

    public static double calcularTotal(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static double[] reajustar(double[] vetor, int percentual) {
        double[] novo = new double[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            novo[i] = vetor[i] + (vetor[i] * percentual / 100.0);
        }

        return novo;
    }
}
