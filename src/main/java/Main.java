
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        
        System.out.println(
                "Please enter a number ");
        int num = scan.nextInt();


      for (int i = 1; i <= num; i++)
            sum += i;
        System.out.println("Sum Of Input " + sum);
    }
}







