import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type any number:");
        double number = sc.nextDouble();

        if (number < 0 || number > 100) {
            System.out.println("Out of range");
        }

        else if (number >= 0 && number <= 25) {
            System.out.println("The number is in the interval [0, 25] ");
        }
        else if (number <= 50.00) {
            System.out.println("The number is in the interval [25, 50]");
        }
        else if (number <= 75.00) {
            System.out.println("The number is in the interval [50, 75]");
        }
        else {
            System.out.println("The number is in the interval [75,100]");
        }

        sc.close();
    }
}
