import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        double[][] notas = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        int aprovados = 0;

        // média de cada aluno
        for (int i = 0; i < l; i++) {
            double media = mediaAluno(notas, i);
            System.out.printf("Media do aluno %d: %.2f\n", i, media);

            if (media >= 7.0) {
                aprovados++;
            }
        }

        // média de cada avaliação
        for (int j = 0; j < c; j++) {
            double media = mediaAvaliacao(notas, j);
            System.out.printf("Media da avaliacao %d: %.2f\n", j, media);
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovados);

        sc.close();
    }

    public static double mediaAluno(double[][] matriz, int linha) {
        double soma = 0;

        for (int j = 0; j < matriz[linha].length; j++) {
            soma += matriz[linha][j];
        }

        return soma / matriz[linha].length;
    }

    public static double mediaAvaliacao(double[][] matriz, int coluna) {
        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }

        return soma / matriz.length;
    }
}
