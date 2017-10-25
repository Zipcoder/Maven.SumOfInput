import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        System.out.println("Give me a number and I'll count to it then add the sum.");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;


        for(int x = 0 ; x <= number; x++) {
           sum = x + sum;
        }
        System.out.println(sum +" Told you I'd do it...");
    }
}
