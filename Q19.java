import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int referencia = somaLinha(matriz, 0);
        int diferentes = 0;

     
        for (int i = 1; i < n; i++) {
            if (somaLinha(matriz, i) != referencia) {
                diferentes++;
            }
        }

        
        for (int j = 0; j < n; j++) {
            if (somaColuna(matriz, j) != referencia) {
                diferentes++;
            }
        }

        
        if (somaDiagonalPrincipal(matriz) != referencia) {
            diferentes++;
        }

        if (somaDiagonalSecundaria(matriz) != referencia) {
            diferentes++;
        }

        if (diferentes == 0) {
            System.out.println("Matriz consistente: sim");
            System.out.println("Valor comum das somas: " + referencia);
        } else {
            System.out.println("Matriz consistente: nao");
            System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + diferentes);
        }

        sc.close();
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

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static int somaDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            soma += matriz[i][n - 1 - i];
        }

        return soma;
    }
}
