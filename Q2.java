import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = sc.nextDouble();
        }

        double maior = maiorNota(notas);
        double menor = menorNota(notas);
        double media = calcularMedia(notas);
        int aprovados = contarAprovados(notas);

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf("Media da turma: %.2f\n", media);
        System.out.println("Quantidade de aprovados: " + aprovados);

        sc.close();
    }

    public static double maiorNota(double[] vetor) {
        double maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static double menorNota(double[] vetor) {
        double menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }

    public static int contarAprovados(double[] vetor) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 7.0) {
                contador++;
            }
        }
        return contador;
    }
}
