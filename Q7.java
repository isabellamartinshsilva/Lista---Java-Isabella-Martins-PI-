import java.util.Scanner;

public class Q7 {

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

        int maiorSoma = Integer.MIN_VALUE;

        for (int i = 0; i < l; i++) {
            int soma = somaLinha(matriz, i);
            System.out.println("Soma da linha " + i + ": " + soma);

            if (soma > maiorSoma) {
                maiorSoma = soma;
            }
        }

        System.out.println("Maior soma: " + maiorSoma);

        sc.close();
    }

    public static int somaLinha(int[][] matriz, int linha) {
        int soma = 0;

        for (int j = 0; j < matriz[linha].length; j++) {
            soma += matriz[linha][j];
        }

        return soma;
    }
}
