/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        promptUser(true);
    }

    public static void promptUser(boolean firstPrompt) {
        Scanner input = new Scanner(System.in);

        if(firstPrompt)
        {
            System.out.println("Enter a number");
        }

        String s = input.nextLine();

        if(isInteger(s))
        {
            int n = Integer.parseInt(s);
            int result = getSum(n);
            System.out.println(result);
        }
        else
        {
            System.out.println("Please enter an integer");
            promptUser(false);
        }
    }

    public static int getSum(int n) {
        int i = 1;
        int result = 0;

        while(i <= n)
        {
            result += i;
            i++;
        }

        return result;
    }

    public static boolean isInteger(String s) {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
    }
}

