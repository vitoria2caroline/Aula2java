package comandoscondicionais;
import java.util.Scanner;

public class Imc<imc> {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float imc;

        System.out.print(" entre com o seu imc: ");
        imc = entrada.nextFloat();


        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("peso ideal");
        } else if (imc > 25 && imc < 29.9) {
            System.out.println("levemente acima do peso");
        } else if (imc > 30.0 && imc < 34.9) {
            System.out.println("obesidade grau 1 ");
        } else if (imc > 35 && imc < 39.9) {
            System.out.println("obesidade grau 2 ");
        } else if (imc > 40) {
            System.out.println("obesidade grau 3");
        } else {
            System.out.println("obesidade grau 4");
        }
    }
}
