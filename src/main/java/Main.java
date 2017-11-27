import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Edits by katherine on 10/18/17
 */
public class Main {

    public static void main(String[] args){
        int sum = 0;
        int n = 0;

        Scanner scan = new Scanner(System.in);
        boolean validInput = false;

        while(!validInput) {
            System.out.println("Please enter an integer greater than 0.");
            System.out.print(">> ");
            try {
                n = scan.nextInt();

                if(n > 0) {
                    validInput = true;
                }
                else {
                    System.out.println("Not a valid integer. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid integer. Try again.");
                scan.next();
                continue;
            }
        }

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.printf("The sum from 1 to %d is %d.%n", n, sum);
    }
}
