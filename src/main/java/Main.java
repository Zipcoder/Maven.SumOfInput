import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("What is your number?");

        number = scanner.nextInt();

        for (int i = 1; i <= number; i++ ){
                sum += i;

        }

        System.out.println(sum);







    }
}
