import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // int number = sc.nextint();
        String name = sc.nextLine();
        double workTime = sc.nextDouble();
        double paymentPerHours = sc.nextDouble();
        double salary = workTime * paymentPerHours;

        System.out.println("Employee: " + name);
        System.out.printf("Salary per day U$: %.2f%n", salary);

        sc.close();
    }
}
