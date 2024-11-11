package comandoscondicionais;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        int n1, n2;

        System.out.print(" entre com a primeira nota: ");
        n1 = nota.nextInt();

        System.out.print(" entre com a primeira nota: ");
        n2 = nota.nextInt();


        if (n1 > n2) {
            System.out.println("numero maior é:" + n1);
        } else if (n2 > n1) {
            System.out.println("o maior número é" + n2);
        } else {
            System.out.println("numeros iguais");
        }
    }
}
