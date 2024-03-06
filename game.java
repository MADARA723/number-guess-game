import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Guess the Number Game!");
        
        
        int lowerLimit = 1;
        int upperLimit = 100;
        
        
        int maxAttempts = 10;
        
        
        int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        int attemptsTaken = 0;
        
        
        while (attemptsTaken < maxAttempts) {
            
            System.out.print("Guess the number (between " + lowerLimit + " and " + upperLimit + "): ");
            int userGuess = scanner.nextInt();
            
            
            attemptsTaken++;
            
            
            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + attemptsTaken + " attempts.");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        
        if (attemptsTaken == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
        }
        
        scanner.close();
    }
}
