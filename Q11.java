import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];
        int[][] transposta = new int[c][l];

        // leitura da matriz
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // gerando a transposta
        gerarTransposta(matriz, transposta, l, c);

        System.out.println("Matriz transposta:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void gerarTransposta(int[][] matriz, int[][] transposta, int l, int c) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
    }
}
