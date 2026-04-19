import java.util.Scanner;

public class Q18 {

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

        int qtd = 0;
        int maiorValor = Integer.MIN_VALUE;
        int posI = -1;
        int posJ = -1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                if (ehPico(matriz, i, j)) {
                    qtd++;

                    if (matriz[i][j] > maiorValor) {
                        maiorValor = matriz[i][j];
                        posI = i;
                        posJ = j;
                    }
                }
            }
        }

        System.out.println("Quantidade de pontos de pico: " + qtd);
        System.out.println("Posicao do maior ponto de pico: " + posI + " " + posJ);
        System.out.println("Valor do maior ponto de pico: " + maiorValor);

        sc.close();
    }

    public static boolean ehPico(int[][] matriz, int i, int j) {
        int valor = matriz[i][j];

       
        if (i > 0 && valor <= matriz[i - 1][j]) {
            return false;
        }

    
        if (i < matriz.length - 1 && valor <= matriz[i + 1][j]) {
            return false;
        }

       
        if (j > 0 && valor <= matriz[i][j - 1]) {
            return false;
        }

      
        if (j < matriz[0].length - 1 && valor <= matriz[i][j + 1]) {
            return false;
        }

        return true;
    }
}
