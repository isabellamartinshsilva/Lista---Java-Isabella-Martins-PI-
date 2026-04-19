import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean diagonalZero = verificarDiagonal(matriz);
        int[] maior = maiorForaDiagonal(matriz);
        int linhaMenor = linhaMenorSoma(matriz);

        if (diagonalZero) {
            System.out.println("Diagonal principal com zeros: sim");
        } else {
            System.out.println("Diagonal principal com zeros: nao");
        }

        System.out.println("Maior valor fora da diagonal: " 
                + maior[0] + " (" + maior[1] + "," + maior[2] + ")");

        System.out.println("Linha com menor soma: " + linhaMenor);

        sc.close();
    }

    public static boolean verificarDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] maiorForaDiagonal(int[][] matriz) {
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != j && matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        return new int[]{maior, linha, coluna};
    }

    public static int linhaMenorSoma(int[][] matriz) {
        int indice = 0;
        int menorSoma = somaLinha(matriz, 0);

        for (int i = 1; i < matriz.length; i++) {
            int soma = somaLinha(matriz, i);
            if (soma < menorSoma) {
                menorSoma = soma;
                indice = i;
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
}
