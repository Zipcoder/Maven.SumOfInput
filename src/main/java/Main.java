import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int numberInput = input.nextInt();
        int numberInput2 = numberInput;

        for (int count = 0; count < numberInput2; count++) {
            numberInput += count;
        }
        System.out.println("The sum of all the numbers from 1 to " +numberInput2 +" is "+ numberInput);

    }
}
