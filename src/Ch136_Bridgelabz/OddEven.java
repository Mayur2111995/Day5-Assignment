package Ch136_Bridgelabz;
import java.util.Scanner;

public class OddEven {
        public static void main(String[] args) {
            System.out.println("Enter Number To Find Odd And Even");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            sc.close();

            if (userInput % 2 == 0)
                System.out.println(userInput + " is even Number");
            else
                System.out.println(userInput + " is odd Number");
        }

    }