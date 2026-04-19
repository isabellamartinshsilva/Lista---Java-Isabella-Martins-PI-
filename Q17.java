import java.util.Scanner;

public class Q17 {

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

        int maiorLinha = Integer.MIN_VALUE;
        int indiceLinha = 0;

        for (int i = 0; i < l; i++) {
            int soma = maiorSubarrayLinha(matriz, i);
            if (soma > maiorLinha) {
                maiorLinha = soma;
                indiceLinha = i;
            }
        }

        int maiorColuna = Integer.MIN_VALUE;
        int indiceColuna = 0;

        for (int j = 0; j < c; j++) {
            int soma = maiorSubarrayColuna(matriz, j);
            if (soma > maiorColuna) {
                maiorColuna = soma;
                indiceColuna = j;
            }
        }

        System.out.println("Maior soma contigua em linha: " + maiorLinha);
        System.out.println("Linha da maior soma contigua: " + indiceLinha);
        System.out.println("Maior soma contigua em coluna: " + maiorColuna);
        System.out.println("Coluna da maior soma contigua: " + indiceColuna);

        sc.close();
    }

    public static int maiorSubarrayLinha(int[][] matriz, int linha) {
        int maxAtual = matriz[linha][0];
        int maxGlobal = matriz[linha][0];

        for (int j = 1; j < matriz[linha].length; j++) {
            maxAtual = Math.max(matriz[linha][j], maxAtual + matriz[linha][j]);
            if (maxAtual > maxGlobal) {
                maxGlobal = maxAtual;
            }
        }

        return maxGlobal;
    }

    public static int maiorSubarrayColuna(int[][] matriz, int coluna) {
        int maxAtual = matriz[0][coluna];
        int maxGlobal = matriz[0][coluna];

        for (int i = 1; i < matriz.length; i++) {
            maxAtual = Math.max(matriz[i][coluna], maxAtual + matriz[i][coluna]);
            if (maxAtual > maxGlobal) {
                maxGlobal = maxAtual;
            }
        }

        return maxGlobal;
    }
}
