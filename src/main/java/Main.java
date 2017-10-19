import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i<= n; i++){
            sum += i;

        }
        System.out.println("Sum of the numbers, 1 to \"Input\": " + sum);

    }
}
