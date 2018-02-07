/**
 * Created by iyasuwatts on 10/17/17.
 * Edited by Haysel 'Gio' on 2/2/18.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
            int number = Integer.parseInt(console.nextLine());

            int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
