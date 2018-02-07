import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //just an int for now
        int a = in.nextInt();
        int sum = 0;
        // why did I even take discrete math?
        for (int i = 1;i <= a;i++) {
            sum+=i;
        }
        System.out.println("sum of all integers from 1 to " + a + ": " + sum);
    }
}
