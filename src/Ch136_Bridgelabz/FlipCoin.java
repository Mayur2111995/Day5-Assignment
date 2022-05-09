package Ch136_Bridgelabz;
import java.util.Scanner;
public class FlipCoin {
        final static int IS_HEAD = 0;
        final static int IS_TAIL = 1;
        int headCount = 0;
        int tailCount = 0;

        public int userInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Flip Of Coin ");
            int numberOfFlip = sc.nextInt();
            sc.close();
            return numberOfFlip;
        }

        public void coin(int n) {

            for (int i = 0; i <= n - 1; i++) {
                int flip = (int) Math.floor(Math.random() * 10 % 2);

                switch (flip) {

                    case IS_HEAD:
                        System.out.println("It is Head");
                        headCount++;
                        break;
                    case IS_TAIL:
                        System.out.println("It is Tail");
                        tailCount++;
                        break;

                }
            }
        }

        public void perOfHeadAndTail(int n) {

            System.out.println("Percent of head Flip count :" + " " + (headCount * 100) / n + "%");
            System.out.println("Percent of tail Flip count :" + " " + (tailCount * 100) / n + "%");
        }

        public static void main(String[] args) {

            FlipCoin obj = new FlipCoin();
            int n = obj.userInput();
            obj.coin(n);
            obj.perOfHeadAndTail(n);
        }

    }
