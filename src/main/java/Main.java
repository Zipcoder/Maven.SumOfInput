import java.util.Scanner;

/**
 * Created by Timothy Rager on 10/18/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int upperBound=input.nextInt();

        input.close();
        
        int sumOfInput=0;
        for (int i=upperBound; i>0; i--)
        {
            sumOfInput+=i;
        }
        System.out.println("The sum of numbers from 1 to "+upperBound+" is "+sumOfInput);
    }
}
