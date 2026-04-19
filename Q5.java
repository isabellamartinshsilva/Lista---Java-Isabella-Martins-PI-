import java.util.Scanner;
public class Q5 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] producao = new int[n];

        for (int i = 0; i < n; i++) {
            producao[i] = sc.nextInt();
        }

        int maior = maiorValor(producao);
        int menor = menorValor(producao);
        int crescimento = maiorCrescimento(producao);

        System.out.println("Maior producao: " + maior);
        System.out.println("Menor producao: " + menor);
        System.out.println("Maior crescimento consecutivo: " + crescimento);

        sc.close();
    }

    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int menorValor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int maiorCrescimento(int[] vetor) {
        int maiorDif = 0;

        for (int i = 1; i < vetor.length; i++) {
            int diferenca = vetor[i] - vetor[i - 1];

            if (diferenca > maiorDif) {
                maiorDif = diferenca;
            }
        }

        return maiorDif;
    }
}
