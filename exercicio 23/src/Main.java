import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = sc.nextInt();

        for (int i = 1; i<= number; i++) {

            System.out.print(i  + " ");
            System.out.print(i * i + " ");
            System.out.println(i * i * i + "");
        }

        sc.close();
    }
}