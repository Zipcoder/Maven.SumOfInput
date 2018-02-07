import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        String answer = number.nextLine();
        int givennumber = Integer.parseInt(answer);
        System.out.println(answer);

        int sum = 0;
        for (int i = 1; i <= givennumber; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }

}