import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;

public class Factors {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number to compute factors:");

            int num = sc.nextInt();

            while (num % 2 == 0) {
                System.out.println(2);
                num /= 2;
            }

            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                while (num % i == 0) {
                    System.out.println(i);
                    num /= i;
                }
            }

            if (num > 2)
                System.out.println(num);

            sc.close();
        }

    }

