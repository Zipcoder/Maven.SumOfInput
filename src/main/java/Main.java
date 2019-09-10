import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int count = 0;


        for (int i = 0; i <= num; i++){
            count = i + count;
        }
        System.out.println("Sum of your input is: " + count);
    }
}



