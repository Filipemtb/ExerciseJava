import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println(name + ", digite o numero: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(name + ", o número digitado é negativo");
        }else {
            System.out.println(name + ", o número digitado é positivo.");
        }

        sc.close();
    }
}
