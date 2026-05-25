import java.util.Random;
import java.util.Scanner;

public class CWH_42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("Enter:");
        System.out.println("0 for Rock");
        System.out.println("1 for Paper");
        System.out.println("2 for Scissors");

        System.out.print("Your choice: ");
        int userChoice = sc.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice!");
            return;
        }

        int computerChoice = random.nextInt(3);

        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        // Game Logic
        if (userChoice == computerChoice) {
            System.out.println("It's a Draw!");
        }
        else if (
                (userChoice == 0 && computerChoice == 2) ||
                        (userChoice == 1 && computerChoice == 0) ||
                        (userChoice == 2 && computerChoice == 1)
        ) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}