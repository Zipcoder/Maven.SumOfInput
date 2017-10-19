import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a number to be summed to all values below it: ");
        int number = keyboard.nextInt();
        int sum = 0;

        for(int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

