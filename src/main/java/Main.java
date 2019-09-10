import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number");
        String input = number.nextLine();
        int giveNumber = Integer.parseInt(input);

int sum = 0;

        for(int i = 0; i <= giveNumber; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}








