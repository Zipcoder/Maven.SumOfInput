import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int response = input.nextInt();
        int count = 1;
        for (int i = 0; i < response; i++){
            count += i;
        }

        System.out.println(count);

    }
}
