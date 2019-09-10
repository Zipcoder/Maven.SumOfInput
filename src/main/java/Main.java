/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int sum = 0;
        System.out.println("Enter your number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);

    }

}