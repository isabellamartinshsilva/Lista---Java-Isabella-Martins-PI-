import java.util.Scanner;

public class Q10 {

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

        int[] somaLinhas = new int[l];
        int[] somaColunas = new int[c];

        // soma das linhas
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somaLinhas[i] += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinhas[i]);
        }

        // soma das colunas
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < l; i++) {
                somaColunas[j] += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColunas[j]);
        }

        int indiceLinha = indiceMaior(somaLinhas);
        int indiceColuna = indiceMaior(somaColunas);

        System.out.println("Linha com maior soma: " + indiceLinha);
        System.out.println("Coluna com maior soma: " + indiceColuna);

        sc.close();
    }

    public static int indiceMaior(int[] vetor) {
        int indice = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indice]) {
                indice = i;
            }
        }

        return indice;
    }
}
