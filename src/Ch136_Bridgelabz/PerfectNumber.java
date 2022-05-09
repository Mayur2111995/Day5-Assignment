package Ch136_Bridgelabz;
import java.util.Scanner;
public class PerfectNumber {
        //function that checks if the given number is perfect or not
        static long isPerfect(long num) {
//variable stores the sum
            long sum = 0;
//executes until the condition becomes false
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
//calculates the sum of factors
                    sum = sum + i;
                } //end of if
            }  //end of for
//returns the sum of factors
            return sum;
        } //end of method

        public static void main(String args[]) {
            long number, s;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
//reads a number from the user
            number = sc.nextLong();
//calling the function
            s = isPerfect(number);
//compares sum with the number
            if (s == number)
                System.out.println(number + " is a perfect number");
            else
                System.out.println(number + " is not a perfect number");
        }
    }