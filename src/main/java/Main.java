import java.util.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
//        Write a program which prompts the user to input a number, n.
        System.out.println("Please enter a number");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sum = 0;
    for(int i=1; i<=n;i++){
        sum += i;
    }
//        The program should respond by printing the sum of the numbers 1 to n.
        System.out.println("The sum of 1 to "+n+" is:"+ sum);
    }
}
