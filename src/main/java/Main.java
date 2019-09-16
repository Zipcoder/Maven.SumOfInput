import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hello! Please put in a number");
        int n = scanner1.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(i);
        }


    }
}
