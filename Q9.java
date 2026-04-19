import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;
        int somaTotal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    somaPrincipal += matriz[i][j];
                    somaTotal += matriz[i][j];
                }

                if (i + j == n - 1) {
                    somaSecundaria += matriz[i][j];

                    // evita repetir o elemento do meio
                    if (i != j) {
                        somaTotal += matriz[i][j];
                    }
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundaria: " + somaSecundaria);
        System.out.println("Soma total das diagonais sem repetir o centro: " + somaTotal);

        sc.close();
    }
}
