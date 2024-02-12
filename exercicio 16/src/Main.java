import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do combustivel abastecido: 1.Álcool | 2.Gasolina | 3.Diesel | 4.Fim: ");

        int combustivelAbastecido = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivelAbastecido != 4) {
            if (combustivelAbastecido == 1) {
                alcool = alcool + 1;
                combustivelAbastecido = sc.nextInt();
            } else if (combustivelAbastecido == 2) {
                gasolina = gasolina + 1;
                combustivelAbastecido = sc.nextInt();
            } else if (combustivelAbastecido == 3) {
                diesel = diesel +1;
                combustivelAbastecido = sc.nextInt();
            } else {
                System.out.println("Esse código não existe, digite outro: ");
                combustivelAbastecido = sc.nextInt();
            }
        }

        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}