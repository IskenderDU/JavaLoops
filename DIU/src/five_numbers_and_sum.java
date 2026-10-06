import java.util.Scanner;

public class five_numbers_and_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        for (int i=1; i<=5; i++) {
            int a = in.nextInt();
            sum = sum + a;
        }
        System.out.println("Sum = " + sum);
    }
}
