import java.util.Scanner;

public class game {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int secret = (int) (Math.random() * 99) + 1;

        while (true) {
            int number = in.nextInt();

            if (number>secret) {
                System.out.println("Too high");
            }
            else if (number<secret) {
                System.out.println("Too low");
            }
            else {
                break;
            }
        }
        System.out.println("You guessed the correct number!");
        System.out.println("Secret number is " + secret);
    }
}
