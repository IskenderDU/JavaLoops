import java.util.Scanner;

public class a_to_b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a<b) {
            System.out.println("a to b:");
            for (int a1 = a; a1 <= b; a1++) {
                System.out.println(a1);
            }
        }
            else if (b < a) {
            System.out.println("b to a:");
                for (int b1 = b; b1 <= a; b1++) {
                    System.out.println(b1);
                }
            }
        }
    }
