/**
 * Created by Frankie!
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to begin: ");
        int n = input.nextInt();
        int result=0;
        for(int i = 1; i <= n; i++){
            result += i;
        }

        System.out.println("Result: " + result);

    }
}
