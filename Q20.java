import java.util.Scanner;

public class Q20 {

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

        int k = sc.nextInt();

        int maior = 0;
        int linhaMaior = 0;
        int inicioMaior = 0;
        int fimMaior = 0;

        for (int i = 0; i < l; i++) {

            int cont = 0;
            int inicioAtual = 0;

            for (int j = 0; j < c; j++) {

                if (matriz[i][j] > k) {
                    if (cont == 0) {
                        inicioAtual = j;
                    }
                    cont++;

                    if (cont > maior) {
                        maior = cont;
                        linhaMaior = i;
                        inicioMaior = inicioAtual;
                        fimMaior = j;
                    }

                } else {
                    cont = 0;
                }
            }
        }

        System.out.println("Maior sequencia acima de " + k + ": " + maior);
        System.out.println("Linha da sequencia: " + linhaMaior);
        System.out.println("Indice inicial: " + inicioMaior);
        System.out.println("Indice final: " + fimMaior);

        sc.close();
    }
}
