package Ch136_Bridgelabz;
import java.util.Scanner;

public class LeapYear {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter year To check it is leap year or not");
            int year = sc.nextInt();
            System.out.println();
            sc.close();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + "->" + "It Is Leap Year ");
            } else {
                System.out.println(year + "->" + "It Is Not Leap Year");

            }
        }
}
