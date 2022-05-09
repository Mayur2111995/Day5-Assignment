package Ch136_Bridgelabz;
import java.util.Scanner;

public class PowerofTwo {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Power Value Between 0 to 31");
            int N = sc.nextInt();
            sc.close();

            for (int i = 1; i <= N; i++) {
                int powerOfTwo = (int) Math.pow(2, i);
                System.out.print(powerOfTwo + " ");
            }
            System.out.println();

        }
}
