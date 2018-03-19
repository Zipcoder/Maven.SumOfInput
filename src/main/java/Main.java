/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = Integer.parseInt(input.nextLine());
        int i = 1;

        while(i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
