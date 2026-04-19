import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int[] saidas = new int[n];
        int[] chegadas = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                saidas[i] += matriz[i][j];
                chegadas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Saidas do terminal " + i + ": " + saidas[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Chegadas no terminal " + i + ": " + chegadas[i]);
        }

        int indice = maiorDiferenca(saidas, chegadas);
        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + indice);

        if (ehSimetrica(matriz)) {
            System.out.println("Matriz simetrica: sim");
        } else {
            System.out.println("Matriz simetrica: nao");
        }

        sc.close();
    }

    public static int maiorDiferenca(int[] saidas, int[] chegadas) {
        int indice = 0;
        int maior = Math.abs(saidas[0] - chegadas[0]);

        for (int i = 1; i < saidas.length; i++) {
            int diff = Math.abs(saidas[i] - chegadas[i]);
            if (diff > maior) {
                maior = diff;
                indice = i;
            }
        }

        return indice;
    }

    public static boolean ehSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
