import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String playAgain;

        System.out.println("Welcome to the Dice rolling Game!");

        do {
            int playerRoll = random.nextInt(6) + 1;
            int computerRoll = random.nextInt(6) + 1;

            System.out.println("You rolled: " + playerRoll);
            System.out.println("Computer rolled: " + computerRoll);

            if (playerRoll > computerRoll) {
                System.out.println("You Win!");
            } else if (playerRoll < computerRoll) {
                System.out.println("Computer Wins!");
            } else {
                System.out.println("It's a Draw!");
            }
            
            System.out.print("Do you want to play again? (Yes or No): ");
            playAgain = input.nextLine(); 
        } while (playAgain.equalsIgnoreCase("Yes"));
                System.out.println("Thanks for playing!");
        
    input.close();    
    }
}