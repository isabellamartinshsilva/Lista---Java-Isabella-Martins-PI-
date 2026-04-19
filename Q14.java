import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int indiceLinha = indiceMaiorLinha(matriz);
        int indiceColuna = indiceMenorColuna(matriz);
        double media = calcularMedia(matriz);
        int qtd = contarAcimaMedia(matriz, media);

        System.out.println("Linha com maior soma: " + indiceLinha);
        System.out.println("Coluna com menor soma: " + indiceColuna);
        System.out.printf("Media geral: %.2f\n", media);
        System.out.println("Quantidade acima da media: " + qtd);

        sc.close();
    }

    public static int indiceMaiorLinha(int[][] matriz) {
        int indice = 0;
        int maiorSoma = somaLinha(matriz, 0);

        for (int i = 1; i < matriz.length; i++) {
            int soma = somaLinha(matriz, i);
            if (soma > maiorSoma) {
                maiorSoma = soma;
                indice = i;
            }
        }

        return indice;
    }

    public static int indiceMenorColuna(int[][] matriz) {
        int indice = 0;
        int menorSoma = somaColuna(matriz, 0);

        for (int j = 1; j < matriz[0].length; j++) {
            int soma = somaColuna(matriz, j);
            if (soma < menorSoma) {
                menorSoma = soma;
                indice = j;
            }
        }

        return indice;
    }

    public static int somaLinha(int[][] matriz, int linha) {
        int soma = 0;
        for (int j = 0; j < matriz[linha].length; j++) {
            soma += matriz[linha][j];
        }
        return soma;
    }

    public static int somaColuna(int[][] matriz, int coluna) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }
        return soma;
    }

    public static double calcularMedia(int[][] matriz) {
        int soma = 0;
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                total++;
            }
        }

        return (double) soma / total;
    }

    public static int contarAcimaMedia(int[][] matriz, double media) {
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > media) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
