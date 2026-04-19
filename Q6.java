import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] tempos = new double[n];

        for (int i = 0; i < n; i++) {
            tempos[i] = sc.nextDouble();
        }

        double menor = menorTempo(tempos);
        double maior = maiorTempo(tempos);

        ordenar(tempos);

        System.out.println("Melhor tempo: " + menor);
        System.out.println("Pior tempo: " + maior);

        System.out.println("Tres melhores tempos:");
        for (int i = 0; i < 3; i++) {
            System.out.print(tempos[i] + " ");
        }

        sc.close();
    }

    public static double menorTempo(double[] vetor) {
        double menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static double maiorTempo(double[] vetor) {
        double maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void ordenar(double[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
