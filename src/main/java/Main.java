import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * This class prints the sum of values from 1 to user input number
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert any integer: ");
        double input = scanner.nextInt();    // save user input
        double sum = 0;
        for (double i=1; i<=input; i++){
            sum+=i;   // add the numbr i into sum untill the number is equal to user input
        }

        System.out.println("The sum is " + sum);
    }
}
