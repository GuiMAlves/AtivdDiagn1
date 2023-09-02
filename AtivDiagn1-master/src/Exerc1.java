
import java.util.Random;

public class Exerc1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int somaTrinta = 0, countTrinta = 0, somaTotal = 0;
        Random randomico = new Random();
        //preenchimento do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = randomico.nextInt(99);
        }
        // loop para mostrar a matriz e para calcular valores
        System.out.println("Vetor: ");
        for (int num: vetor) {
            System.out.println(num + " ");
            if (num > 30) {
                countTrinta ++;
                somaTrinta += num;
            }
            somaTotal += num;
        }
        System.out.println("Quantidade de números maiores que 30: " + countTrinta);
        System.out.println("Soma dos valores maiores que 30: " + somaTrinta);
        System.out.println("Soma total: " + somaTotal);
    }
}
