import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String numero;
        String resultado = "";
        numero = ler.next();
        int i = numero.length();

        while (i > 0) {
            i--;
            resultado = resultado + numero.charAt(i);
        }
        System.out.println(resultado);
    }
}