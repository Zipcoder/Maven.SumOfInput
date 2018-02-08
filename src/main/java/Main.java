import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {


        Scanner scannerS = new Scanner(System.in);

        try
        { System.out.println("Enter any number.");

            int userNumber = scannerS.nextInt();

            if (userNumber >= 1) {
                int sum = 0;
                for(int i = 1; i <= userNumber; i++){
                    sum += i;
                }
                System.out.println("Now you've got $" + (sum) + " bro");
            } else {
                System.out.println("Try a positive number.");
            }
        }
        catch(InputMismatchException exception){
            System.out.println("I said a number, bro.");
        }

    }
}
