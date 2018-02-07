import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= num ; i++){
            sum = i + sum;

        }
        System.out.println(sum);
    }
}
