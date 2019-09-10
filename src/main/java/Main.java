/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /**/

        Scanner sn = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int n = sn.nextInt();
        int sum = 0;


        for (int i = 1; i <= n; i++) {

            sum += i;

        }

        System.out.println(sum);

    }

}