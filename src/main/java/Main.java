import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide a number.");

        int inputNumber = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= inputNumber; i++ ){
            sum += i;
        }

        System.out.printf("The final sum using number %d, is %d", inputNumber, sum);
    }
}
