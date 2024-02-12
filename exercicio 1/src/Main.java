import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = 2002;
        int passwordAttempt = 0;

        System.out.println("Enter your password: ");

        passwordAttempt = sc.nextInt();

        while (passwordAttempt != password) {

            System.out.println("Invalid password!");
            passwordAttempt = sc.nextInt();
        }

        System.out.println("Access allowed");

        sc.close();
    }
}