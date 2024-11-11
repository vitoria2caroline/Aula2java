package comandoscondicionais;
import java.util.Scanner;

public class Imparoupar {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int numero;

        System.out.print(" entre com o número: ");
        numero = valor.nextInt();

        if (numero % 2 == 0 ) {
            System.out.println("o numero é par");
        } else {
            System.out.println("o número é impar ");
        }
    }
}
