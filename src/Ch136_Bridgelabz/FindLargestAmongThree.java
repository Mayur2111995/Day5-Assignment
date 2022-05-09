package Ch136_Bridgelabz;
import java.util.Scanner;

public class FindLargestAmongThree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Three Number to find out largest one");

            int first = sc.nextInt();
            int secound = sc.nextInt();
            int third = sc.nextInt();
            sc.close();

            int largest = 0;
            if (first > secound && first > third)
                largest = first;

            else if (secound > first && secound > third)
                largest = secound;

            else
                largest = third;
            System.out.println("Largest one Among three : " + largest);
        }
}
