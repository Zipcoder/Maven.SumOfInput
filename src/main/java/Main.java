import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("What is your number? ");
        int inputValue = in.nextInt();

        int sumOfNumbers = 0;
        for (int i = 1; i<= inputValue; i++) sumOfNumbers +=i;



        System.out.println
                ("Your number: " + inputValue + " results in a sum of " + sumOfNumbers);





    }
}
