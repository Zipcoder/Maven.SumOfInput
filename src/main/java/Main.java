import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = sc.nextInt();
        int sumNum = 0;
        for(int i=1; i <= userInput; i++) {
            sumNum = sumNum+i;
        }
        System.out.print(sumNum);
    }
}
