import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
            //System.out.println("Sum = " + sum);
        }
        System.out.println("The sum of the numbers from 1 to " + number + " is " + sum);


    }

}
