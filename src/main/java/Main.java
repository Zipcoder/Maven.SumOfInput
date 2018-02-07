import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int userNum = sc.nextInt();
        int sumNum = 0;

        for (int i = 0; i <= userNum; i++) {

            sumNum += i;

        }

        System.out.println("The sum from 1 to " + userNum + " is: " + sumNum);

    }

}
