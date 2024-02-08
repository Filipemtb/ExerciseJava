import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        double amount = sc.nextDouble();
        double price;

        if (code == 1) {
            price = 4.00;
            System.out.printf("Amount to pay $: %.2f%n", amount * price);
        } 
        else if (code == 2) {
            price = 4.50;
            System.out.printf("Amount to pay $: %.2f%n", amount * price);
        }
        else if (code == 3) {
            price = 5.00;
            System.out.printf("Amount to pay $: %.2f%n", amount * price);
        }
        else if (code == 4) {
            price = 2.00;
            System.out.printf("Amount to pay $: %.2f%n", amount * price);
        }
        else if (code == 5) {
            price = 1.50;
            System.out.printf("Amount to pay $: %.2f%n", amount * price);
        }
        else {
            System.out.println("We don´t have this dish in on our menu");
        }
        sc.close();
    }
}