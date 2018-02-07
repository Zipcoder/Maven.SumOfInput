import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {


        Scanner makeMoney = new Scanner(System.in);

        try
        { System.out.println("Enter any number.");

            int whatChaGot = makeMoney.nextInt();
            boolean n = whatChaGot >= 0;

            if (n) {
                System.out.println("Now you've got $" + (whatChaGot + 1) + " bro");
            } else {
                System.out.println("Try a positive number.");
            }
        }
        catch(InputMismatchException exception){
            System.out.println("I said a number, bro.");
        }

    }
}
