/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int sumOfIn = 0;

        System.out.println("Please enter a number: ");
        int n = in.nextInt();

        while (n > 0) {
            sumOfIn += n;
            n--;

        }

        System.out.println(sumOfIn);




    }
}
