import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgainChoice;

        do {
            String playerAMove;
            String playerBMove;

            while (true) {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerAMove = scanner.next().toUpperCase();
                if (playerAMove.equals("R") || playerAMove.equals("P") || playerAMove.equals("S")) {
                    break;
                } else {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                }
            }

            while (true) {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerBMove = scanner.next().toUpperCase();
                if (playerBMove.equals("R") || playerBMove.equals("P") || playerBMove.equals("S")) {
                    break;
                } else {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                }
            }

            if (playerAMove.equals(playerBMove)) {
                String moveName;
                if (playerAMove.equals("R")) {
                    moveName = "Rock";
                } else if (playerAMove.equals("P")) {
                    moveName = "Paper";
                } else {
                    moveName = "Scissors";
                }
                System.out.println(moveName + " vs " + moveName + ". It's a Tie!");
            } else if (playerAMove.equals("R") && playerBMove.equals("S")) {
                System.out.println("Rock breaks Scissors. Player A wins!");
            } else if (playerAMove.equals("P") && playerBMove.equals("R")) {
                System.out.println("Paper covers Rock. Player A wins!");
            } else if (playerAMove.equals("S") && playerBMove.equals("P")) {
                System.out.println("Scissors cuts Paper. Player A wins!");
            } else {
                if (playerBMove.equals("R") && playerAMove.equals("S")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerBMove.equals("P") && playerAMove.equals("R")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else if (playerBMove.equals("S") && playerAMove.equals("P")) {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            }

            System.out.print("Play again? [Y/N]: ");
            playAgainChoice = scanner.next();

        } while (playAgainChoice.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}