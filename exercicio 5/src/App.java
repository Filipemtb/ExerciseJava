import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, amount1, code2, amount2;
        double price1, price2, total;

        code1 = sc.nextInt();
        amount1 = sc.nextInt();
        price1 = sc.nextDouble();
        
        code2 = sc.nextInt();
        amount2 = sc.nextInt();
        price2 = sc.nextDouble();

        total = amount1 * price1 + amount2 * price2;

        System.out.printf("Amount to pay: U$%.2f", total);

        sc.close();
    }
}
