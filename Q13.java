import java.util.Scanner;
public class Q13 {
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

        double media = calcularMedia(matriz);
        int maior = maiorElemento(matriz);
        int qtd = contarMaiores(matriz, k);

        System.out.printf("Media dos elementos: %.2f\n", media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Quantidade acima de " + k + ": " + qtd);

        sc.close();
    }

    public static double calcularMedia(int[][] matriz) {
        int soma = 0;
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                total++;
            }
        }

        return (double) soma / total;
    }

    public static int maiorElemento(int[][] matriz) {
        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

    public static int contarMaiores(int[][] matriz, int k) {
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > k) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
