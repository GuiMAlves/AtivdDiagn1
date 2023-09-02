import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        int[][] estoque = new int[4][5];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insira o número do armário (0 a 4) ou -1 para encerrar:");
            int armario = scanner.nextInt();
            if (armario == -1) {
                break;
            }if (armario < 0 || armario > 4) {
                System.out.println("Armário inválido. ");
                continue;
            }
            System.out.println("Informe o número da prateleira (0 a 3):");
            int prateleira = scanner.nextInt();
            if (prateleira < 0 || prateleira > 3) {
                System.out.println("Prateleira inválida. ");
                continue;
            }
            System.out.println("Informe a quantidade de caixas a serem inseridas (0 a 10):");
            int quantidade = scanner.nextInt();
            if (quantidade < 0 || quantidade > 10) {
                System.out.println("Quantidade inválida.");
                continue;
            }if (estoque[prateleira][armario] + quantidade > 10) {
                System.out.println("Espaço insuficiente na prateleira do armário.");
                continue;
            }
            estoque[prateleira][armario] += quantidade;

            System.out.println("Caixas adicionadas!");
        }


        for (int prateleira = 0; prateleira < 4; prateleira++) {
            for (int armario = 0; armario < 5; armario++) {
                System.out.println("Armário " + armario + ", Prateleira " + prateleira + ": " + estoque[prateleira][armario] + " caixas");
            }
        }

        scanner.close();
    }
}