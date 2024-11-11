package comandoscondicionais;
import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {

        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.print(" entre com a sua idade: ");
        idade = entrada.nextInt();


        if (idade >= 18 && idade <=69) {
            System.out.println("seu voto é obrigatório!");
        } else if (idade >=16|| idade >69) {
            System.out.println("voto opicional");
        } else {
            System.out.println("você não pode votar");
        }
    }
}
