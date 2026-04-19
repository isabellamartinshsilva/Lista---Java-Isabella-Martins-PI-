import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] codigos = new int[n];

        for (int i = 0; i < n; i++) {
            codigos[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int posicao = buscar(codigos, x);

        if (posicao != -1) {
            System.out.println("Codigo encontrado");
            System.out.println("Primeira posicao: " + posicao);
        } else {
            System.out.println("Codigo nao encontrado");
        }

        sc.close();
    }

    public static int buscar(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i; // retorna na primeira vez que encontra
            }
        }
        return -1; // não encontrou
    }
}
