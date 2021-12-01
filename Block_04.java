import java.util.Scanner;

/**
 *
 * @author soufi
 */
public class Block_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int max = 0, min = 0, num, i, stopCount;
        double average = 0;
        System.out.println("Intro contador");
        stopCount = in.nextInt();
        
        for (i = 0; i < stopCount; i++) {
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
        System.out.println("la media es " + (average / stopCount) + " el mínimo es " + min + " el máximo es " + max);
    
    
    
    
    }
}