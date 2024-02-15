import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 0; i<number; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.println("Impossible division");
            } else {
                System.out.println(a / b);
            }

        }
    }
}