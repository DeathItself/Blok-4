
import java.util.Scanner;

/**
 *
 * @author soufi
 */
public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] inventari = new int[10];
        int contador, suma = 0;

        for (contador = 0; contador < inventari.length; contador++) {
            inventari[contador] = in.nextInt();
        }
        for (contador = 0; contador < inventari.length; contador++) {
            suma = suma + inventari[contador];
        }
        System.out.println("La suma és " + suma);
 
    }
}
