import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) menor = numero;
            if (numero > maior) maior = numero;
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        sc.close();
    }
}
