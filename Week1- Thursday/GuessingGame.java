import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = new java.util.Random().nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        boolean won = false;
        System.out.println("Welcome! Guess a number from 1 to 100");
        System.out.println("You have only 7 attempts.");
                    while(attempts < 7 && !won){
                        guess = readGuess(input);
                        attempts++;
                        if(guess == secret){
                            System.out.println("Correct! You won in " + attempts + " attempts. ");
                            won = true;
                        }else{
                            giveHint (guess,secret);
                            System.out.println("Attempts left: " + (7 - attempts));
                        }
                    } 
                    if (!won) {
                        System.out.println("Game Over! You ran out of attempts.");
                        System.out.println("The secret number is: " + secret);
                    }
    }
    public static int readGuess(Scanner input){
        System.out.print("Enter your number: ");
        return input.nextInt();
    }
    public static void giveHint(int guess, int secret) {
        if (guess > secret) {
            System.out.println("Too high!");
        }else{
            System.out.println("Too low!");
        }
    }
}
