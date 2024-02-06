import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			int y = sc.nextInt();
	
			int sum = x + y;
	
			System.out.println("SOMA = " + sum);
	
			sc.close();

    }
}
