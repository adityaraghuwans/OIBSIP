import java.util.Scanner;
import java.util.Random;

public class Game1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.println("Let's start the game");
        System.out.println("You can leave the game by entering 101");
        System.out.println("Enter the number from 1-100 : ");
        int ran_num = sc.nextInt();

        Random random = new Random();
        int comp_num = random.nextInt(100);
        if (ran_num == 101) {
            System.out.println("Exit game ");
        } else {
            if (ran_num > 0 && ran_num < 101) {
                while (comp_num != ran_num) {
                    if (count <= 5) {
                        if (ran_num > comp_num) {
                            System.out.println("Enter the smaller number");
                            ran_num = sc.nextInt();
                            count++;

                        }

                        else if (ran_num < comp_num)

                        {
                            System.out.println("Enter the larger number");
                            ran_num = sc.nextInt();
                            count++;

                        }

                        if (ran_num == comp_num) {
                            System.out.println("Congo You successfully guessed the number");
                            System.out.println("Your guessed number is " + ran_num);
                            System.out.println("NO of attempts=" + count);
                            int per = 100 / count;
                            System.out.println("Points based on the number of attempts :" + per);

                        }
                    } else {
                        break;
                    }
                }

            } else {
                System.out.println("Plzz enter valid number :");
                System.out.println("Restart the game");
            }
        }
    }

}
