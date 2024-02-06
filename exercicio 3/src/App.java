import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int dif = a * b - c * d;

        sc.close();

        System.out.println("A diferença do produto A e B pelo produto C e D é de: " + dif);
    }
}
