
import java.util.Scanner;

/**
 *
 * @author soufi
 */
public class Block_03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0, min = 0, num, i;
        double average = 0;

        for (i = 0; i < 20; i++) {
            System.out.println("Intro num");
            num = in.nextInt();
            average = average + num;

            if (i == 0) {
                max = num;
                min = num;
            } else {
                if (num > max) {
                    max = num;
                } else {
                    if (num < min) {
                        min = num;
                    }
                }
            }

        }
        System.out.println("la media es " + (average / 20) + " el mínimo es " + min + " el máximo es " + max);

    }
}
