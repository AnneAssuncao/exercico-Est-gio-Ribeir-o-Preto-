import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ler.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à seq. Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à seq. Fibonacci.");
        }
    }

    public static boolean verificarFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        return false;
    }
}

