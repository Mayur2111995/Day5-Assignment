package Ch136_Bridgelabz;
import java.util.Scanner;

public class SwapOfTwoNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first Number ");
            int a =sc.nextInt();
            System.out.print("Enter Secound Number ");
            int b =sc.nextInt();
            sc.close();
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("After Swaping Two numbers ");

            System.out.println("Secound Number Swap to First: "+a+ " , "+"First Number Swap to Secound : " +b);


        }
}
