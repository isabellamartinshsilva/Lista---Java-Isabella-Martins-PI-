import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] consumo = new int[n];

        for (int i = 0; i < n; i++) {
            consumo[i] = sc.nextInt();
        }

        int total = calcularTotal(consumo);
        double media = calcularMedia(total, n);
        int acimaMedia = contarAcimaMedia(consumo, media);

        System.out.println("Consumo total: " + total);
        System.out.println("Consumo medio: " + media);
        System.out.println("Dias acima da media: " + acimaMedia);

        sc.close();
    }

    public static int calcularTotal(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static double calcularMedia(int total, int quantidade) {
        return (double) total / quantidade;
    }

    public static int contarAcimaMedia(int[] vetor, double media) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                contador++;
            }
        }
        return contador;
    }
}
