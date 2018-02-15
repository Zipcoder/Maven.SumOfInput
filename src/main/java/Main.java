import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int userInput = reader.nextInt();
        int i;
        int storedAnswer = 0;
        for (i = userInput; i > 0; i--){
            storedAnswer += i;
        }
        System.out.println(storedAnswer);
    }
}
