import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gNum = 0;
        int userNum = 0;
        gNum = (int) (10*Math.random()+1);
        System.out.println("Welcome to our guessing game!" + "\n");
        System.out.println("Guess a number between 0 and 10" + "\n");
        userNum = Integer.parseInt(scanner.nextLine());
        System.out.println("The number that you have chosen is: " + userNum + "\n" + "The number that we chose is: " +
                + gNum + "\n");
        if(gNum == userNum)
        { //Start of if statement
            System.out.println("Congratulations, you have guessed the right number!");
        } else
        {
            System.out.println("Oh no, you didn't guess the correct number!" + "\n" +
                    "The correct number was: " + gNum);
        }
    }
}