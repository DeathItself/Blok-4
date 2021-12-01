
import java.util.Scanner;

public class Block_02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i, num = 0, multi;

        System.out.println("Intro tabla");
        i = in.nextInt();
        do {

            multi = i * num;
            num++;

            if (multi % 2 == 0) {
                System.out.println(multi);
            } else {
            }

        } while (num < 11);

    }
}
