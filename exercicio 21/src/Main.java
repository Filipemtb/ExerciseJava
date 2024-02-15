import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int fat = 1;

        for (int i = 1; i<=number; i++) {
            fat = fat * i ;
        }

        System.out.println(fat);

        sc.close();
    }
}