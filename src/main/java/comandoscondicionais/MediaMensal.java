package comandoscondicionais;

import java.util.Scanner;

public class MediaMensal {
    public static void main(String[] args) {

        float salario , salario2, salario3, salario4, salario5, salario6, media;
        Scanner entrada = new Scanner(System.in);
        System.out.print(" entre com o seu 1 salario: ");
        salario = entrada.nextFloat();

        System.out.print(" entre com o seu 2 salario: ");
        salario2 = entrada.nextFloat();

        System.out.print(" entre com o seu 3 salario: ");
        salario3 = entrada.nextFloat();

        System.out.print(" entre com o seu 4 salario: ");
        salario4 = entrada.nextFloat();

        System.out.print(" entre com o seu 5 salario: ");
        salario5 = entrada.nextFloat();

        System.out.print(" entre com o seu 6 salario: ");
        salario6 = entrada.nextFloat();

        media = (salario+salario2+salario3+salario4+salario5+salario6)/6;

        if (media >=0 && media <= 500) {
            System.out.println("nenhum crédito ");
        } else if (media >= 501 && media <= 1000) {
            System.out.println("seu credito é 30%: r$" + (media * 1.3));
        } else if (media > 1001 && media < 3000) {
            System.out.println("seu crédito é 40%: r$" + (media * 1.4));
        } else if (media > 3001) {
            System.out.println("seu credito é 50%: r$" + (media * 1.5));
        } else {
            System.out.println("valor alto demais");
        }

    }
}
