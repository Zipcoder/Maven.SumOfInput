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
            System.out.println("Now you've got $" + (whatChaGot + 1) + " bro");

        }
        catch(InputMismatchException exception){
            System.out.println("I said a number, bro.");
        }

    }
}
