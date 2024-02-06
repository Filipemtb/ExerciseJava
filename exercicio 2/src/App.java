import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area, pi = 3.14159;
	    
	    r = sc.nextDouble();

	    area = pi * r * r;

	    System.out.printf("O valor do do raio deste circulo é de: %.4f%n", area);

		sc.close();
    }
}
