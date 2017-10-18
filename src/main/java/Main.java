import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = sc.nextInt();

        for (int x = 1; x <= userInput; x++) {
            sum += x;
        }

        System.out.println("The sum of the numbers until " + userInput + " is " + sum);
    }
}
