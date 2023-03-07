import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        int userNumber = rand.nextInt(100) + 1; // generates a random number  between 1 and 100 for the user
        System.out.println("Welcome to the DMV. Please take a number. Your number is " + userNumber + ". Please wait until your number is called.");

        int currentNumber = userNumber + 1; // starts with the number after the users number
        boolean userCalled = false; // track their number

        while (true) {
            System.out.println("Now serving number " + currentNumber + ".");
            if (currentNumber == userNumber) {
                userCalled = true; // user's number has been called
            }
            if (userCalled && currentNumber == userNumber) {
                System.out.println("You may now proceed to the desk.");
                break; // stops the loop once the users number is called
            }
            currentNumber = (currentNumber % 100) + 1; // wrap around to 1 if currentNumber reaches 100
        }

        System.out.println("Sorry, you don't have the required paperwork.");
    }
}
