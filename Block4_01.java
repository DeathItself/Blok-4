
import java.util.Scanner;

public class Block4_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 1, i = 0;

        String Impar = "";

        while (i < 20) {

            if (num % 2 == 1) {
                System.out.println(num);
                i++;
                num++;
            } else {
                num++;
            }

        }

    }
}
