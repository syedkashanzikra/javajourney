import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors):");
        String userChoice = scanner.next().toLowerCase();

        if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
            String[] options = {"rock", "paper", "scissors"};
            String computerChoiceStr = options[computerChoice];

            System.out.println("Computer chooses: " + computerChoiceStr);

            // Determine the winner
            if (userChoice.equals(computerChoiceStr)) {
                System.out.println("It's a tie!");
            } else if (
                    (userChoice.equals("rock") && computerChoiceStr.equals("scissors")) ||
                            (userChoice.equals("paper") && computerChoiceStr.equals("rock")) ||
                            (userChoice.equals("scissors") && computerChoiceStr.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
        }


    }
}
