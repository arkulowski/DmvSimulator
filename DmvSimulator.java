import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        int userNumber = rand.nextInt(200) + 1; // generates a random number  between 1 and 200 for the user
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
            currentNumber = (currentNumber % 200) + 1; // wrap around to 1 if currentNumber reaches 200
        }

        System.out.println("You must be blind, as the sign says without the papers, you will not receive assistance, so stop wasting everyone's time and get out of my sight! And don't come back until you have those papers!");
    }
}
