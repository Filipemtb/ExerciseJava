import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = sc.nextLine();

        System.out.println(name + ", type your number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(name + ", your number is even");
        }
        else {
            System.out.println(name + ", your number is odd");
        }
        sc.close();
    }
}
