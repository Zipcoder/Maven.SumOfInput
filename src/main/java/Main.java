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
            int i = 1;

            while(i <= n)
            {
                System.out.println(i);
                i++;
            }
        }

        else
        {
            System.out.println("Please enter an integer");
            promptUser(false);
        }
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

