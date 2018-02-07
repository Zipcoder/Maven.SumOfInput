import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNum = userInput.nextInt();
        int sumOfNum = 0;
        for (int i = 1; i <= userNum; i++) {
            sumOfNum = sumOfNum + i;
        }
        System.out.println(sumOfNum);
    }
}
