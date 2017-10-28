import java.util.Scanner;

public class Main {
//    Write a program which prompts the user to input a number, n.
//    The program should respond by printing the sum of the numbers 1 to n.
//    Constraint: No Guassian wizardry !

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int userInput = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= userInput; i++) {
            sum += userInput;
            System.out.println(sum);
        }
    }
}
