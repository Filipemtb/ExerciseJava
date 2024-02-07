import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the game start time: ");
        int startTime = sc.nextInt();
    
        System.out.println("Type the end time of the game: ");
        int endTime = sc.nextInt();

        int time;

        if (startTime < endTime) {
            time = endTime - startTime;
        } 
         else {
            time = 24 - startTime + endTime;
        } 

        System.out.println("The game lasts " + time + " hours");

        sc.close();
    }
}

