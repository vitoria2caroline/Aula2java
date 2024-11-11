package comandoscondicionais;
import java.util.Scanner;

public class OmenorNumero {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print(" entre com a primeira nota: ");
        n1 = nota.nextInt();

        System.out.print(" entre com a primeira nota: ");
        n2 = nota.nextInt();

        System.out.print(" entre com a primeira nota: ");
        n3 = nota.nextInt();


        if (n1 < n2 && n1 < n3 ) {
            System.out.println("o numero menor é: " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("o menor número é" + n2);
        } else if (n3 < n1 && n3 <n2 ) {
            System.out.println("o menor número é " + n3);
        } else {
            System.out.println("números iguais, tente novamente ");
        }
    }
}
