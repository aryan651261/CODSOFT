import java.util.Scanner;
import java.util.Random;


public class Number_game {
    static int count = 0;
    public static void main(String [] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        boolean PlayAgain ;
        do {
            int number ;
            int guess = rm.nextInt(100)+1;
            int i = 10;

            while (i>=1){
                System.out.println("you have " +i+" attempt");
                if (i==10){
                    System.out.println("Enter a number in range of 1 to 100.");
                }
                number = sc.nextInt();
                if (number == guess){
                    System.out.println("Correct! You guessed it.");
                    count++;
                    System.out.println("your score is "+count);
                    break;
                } else if (number >100) {
                    System.out.println("Enter number is out of range");

                } else if (number > guess ) {
                    System.out.println("Too high! try again.");
                } else if (number < guess)
                    System.out.println("Too low! try again.");
                i--;
            }

            sc.nextLine();
            System.out.println("Do you want to play again! (YES/NO)");
            String response = sc.nextLine().trim().toLowerCase();
            PlayAgain = response.equals("yes");
        }
        while (PlayAgain);
        sc.close();
        System.out.println("Thank You for Playing.");

    }
}